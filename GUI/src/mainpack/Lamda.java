package mainpack;

interface Test{
	public void testing(int i);
}

class Execution{
	public void call(Test test, int value) {
		test.testing(value);
	}
}

public class Lamda {

	public static void main(String[] args) {
		Execution exec = new Execution();
		//anonymous class
		exec.call(new Test(){

			@Override
			public void testing(int value) {
				// TODO Auto-generated method stub
				System.out.println("testing1"+value);
			}
			
		}, 3);
		
		//equivalent lambda call
		exec.call((value)->{
			System.out.println("testing1");
		}, 9);
		exec.call((value)->{
			System.out.println("testing");
		}, 7);
	}

}
