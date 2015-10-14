package mainpack;

class Test{
	//in java 6 and below if your throwing an exception java makes sure you have the strict type "exception" that is thrown
	//after java 6 it does not do the strict type checking
	public void testing(int num) throws Exception{
		//should throw FirstException, SecondException
		try {
			if(num<3) {
				throw new FirstException();
			} else {
				throw new SecondException();
			}
		} catch (Exception e) {
			throw e;
		}
	}
}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
