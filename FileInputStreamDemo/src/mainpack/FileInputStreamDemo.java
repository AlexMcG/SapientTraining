package mainpack;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo {
	public static void main(String args[]) throws IOException {
		int size;
		InputStream f = new FileInputStream("FileInputStreamDemo.java");
		System.out.println("Total Available Bytes: " + (size = f.available()));
		int n = size/40;
		System.out.println("First " + n + " bytes of the file one read() at a time");
		
		for (int i = 0; i < n; i++) {
			System.out.print(f.read());
		}
		
		System.out.println("\nStill Available: " + f.available());
		System.out.println("Reading the next " + n + " with one read(b[])");
		
		Byte b[] = new Byte[n];
		if (f.available() != n) {
			System.err.println("couldn't read " + n + " bytes.");
		}
		//System.out.println(new String(b, 0, n));
		System.out.println("\nStill Available " + n + " bytes.");
		System.out.println();
	}
}
