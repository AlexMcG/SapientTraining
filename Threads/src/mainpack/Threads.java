package mainpack;

class Data{
	private int value;
	
	public void getValue() {
		System.out.println(value);
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}

class Runner implements Runnable {
	Data data;
	Thread secondThread;
	public Runner() {
		data = new Data();
		secondThread = null;
	}
	@Override
	public void run() {
		Thread currThread;
		for(int counter=0; counter<10; counter++) {
			currThread = Thread.currentThread();
			
			if(currThread.getName().equals("Producer")){
				System.out.println(currThread);
				synchronized (data) {
					data.setValue(counter+1);
					try {
						data.notify();
						if (!secondThread.isAlive()){secondThread.start();}
						data.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} else if (currThread.getName().equals("Consumer")) {
				System.out.println(currThread);
				synchronized (data) {
					data.getValue();
					try {
						data.notify();
						data.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	public void setSecondThread(Thread secondThread) {
		this.secondThread = secondThread;
	}
}

public class Threads {
	public static void main(String[] args) {
		Runner runner = new Runner();
		
		Thread firstThread = new Thread(runner, "Producer");
		Thread secondThread = new Thread(runner, "Consumer");
		
		firstThread.start();
		runner.setSecondThread(secondThread);
		
		
		//Finally block executes unless the code is unreachable or a system call ends execution
		try {
			//Integer.parseInt("tacos");
			Thread error = null;
			error.checkAccess();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("The End");

		}
	}
}
