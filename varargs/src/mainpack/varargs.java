package mainpack;

public class varargs {
	
	public static void main(String[] args) {
		System.out.println(vararg(1,2,3,4,5,6,7,8,9));
	}

	public static int vararg(int...nums){
		int counter = 0;
		int sum = 0;
		for (int num : nums) {
			sum += num; counter++;
		}
		return sum /= counter;
	}
}