package mainpackage;

import pack1.Base1;
import pack1.Base2;
import pack2.Derived1;

public class MainApp {

	public static void main(String[] args) {
		Base1 base = new Base1();
		base.pubf = "public";
		base.test1();
		Base2 base2 = new Base2();
		base2.test2();
		Derived1 derived = new Derived1();
		derived.test3();
		System.out.println("finished.");
	}

}
