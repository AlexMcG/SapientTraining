package mainpack;

public class MainApp {
	
	public static void main(String[] args) {
		Point[] pointArray = createArray();
		for (Point point : pointArray) {
			System.out.println(point);
		}
		
	}
	
	public static Point[] createArray(){
		Point[] p;
		p = new Point[10];
		for (int i = 0; i<10; i++) {
			p[i] = new Point(i, i+1);
		}
		
		return p;
	}
}
