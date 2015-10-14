package mainpack;

public class MainApp {
	public static void main(String[] args) {
		//array is an object
		System.out.println("Begin");
		int[][][] num;
		num = new int[5][3][2];
		num[1][1][1] = 5;
		int MDAcounter = 0;  int arrayCounter = 0; int valueCounter = 0;
		for (int[][] multiDimArray : num) {
		MDAcounter = 0;
			for (int[] array : multiDimArray) {
				arrayCounter = 0;
				for (int value : array) {
					System.out.print("num[" + MDAcounter + "]" + "[" + arrayCounter + "]" + "[" + valueCounter + "]: ");
					System.out.print(value + "\n");
					arrayCounter++;
				}
				MDAcounter++;
			}
		valueCounter++;
		}
	}
}
