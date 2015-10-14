package mainpack;

class Test1 {
	public void testing1(){
		
	}
}

abstract class Test2{
	public abstract void testing2();
}

interface Test3{
	public void testing3();
}

public class MainClass {
	public static void main(String[] args) {
		Test1 t1 = new Test1(){
			@Override
			public void testing1(){
				System.out.println("testing1");
			}
		};
		t1.testing1();
		Test2 t2 = new Test2() {
			@Override
			public void testing2(){
				System.out.println("testing2");
			}
		};
		t2.testing2();
		Test3 t3 = new Test3(){
			@Override
			public void testing3() {
				// TODO Auto-generated method stub
				
			}
		};
		t3.testing3();
	}
}
