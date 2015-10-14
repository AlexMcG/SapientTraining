package mainpack;

import java.util.Enumeration;
import java.util.Properties;

public class MainApp {
	public static void main(String[] args) {
		Properties sysProperties = System.getProperties();
		
		Enumeration keys = sysProperties.keys();
		String key;
		
		while (keys.hasMoreElements()) {
			key = (String)keys.nextElement();
			System.err.println(key + " : " + sysProperties.get(key));
		}
	}
}
