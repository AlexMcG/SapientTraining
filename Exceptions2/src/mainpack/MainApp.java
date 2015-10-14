package mainpack;

public class MainApp {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		try{
			int num1 = 0; int num2 = 0;
			try {
				num1 = Integer.parseInt(args[0]);
				num2 = Integer.parseInt(args[1]);
				System.out.println("End of nested try");
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			System.out.println(num1/num2);
			
			System.out.println("End of Try Block");
			} catch(ArrayIndexOutOfBoundsException e){
				System.out.println("java <MainClass> <first_number> <second_number>");
			} catch(ArithmeticException e) {
				System.out.println("You cannot divide by zero");
			} catch(NumberFormatException e){
				System.out.println("Please provide valid numbers");
			}
		System.out.println("End");
	}
}
