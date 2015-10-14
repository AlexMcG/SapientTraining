package mainpack;

import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

//example1
class Base{
	public void test() throws SQLException, IOException{
		System.out.println("Base");
	}
}

class Derived extends Base{
	public void test() throws EOFException{
		System.out.println("Derived");
	}
}


//example2
class IllegalAgeException extends Exception {
	public String getMessage() {
		return "You need to be 18 or above to register to vote.";
	}
}

class Vote{
	public void register(int age) throws IllegalAgeException {
		if(age<18) {
			throw new IllegalAgeException();
		}
		System.out.println("You are eligible to register for vote");
	}
}
	
public class MainApp {
	public static void main(String[] args) {
		//example 1
		Base b = new Derived();
		try {
			b.test();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//example 2
		Vote vote = new Vote();
		try {
			vote.register(18);
		} catch (IllegalAgeException e) {
			e.printStackTrace();
		}
	}
}
