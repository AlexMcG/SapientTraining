package mainpack;

public class Enum {
	enum Apple {
		Jonathon(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
	
		private int price; //price of each apple
		
		//constructor
		Apple(int p) { price = p; }
		
		int getPrice() { return price;}
	}

	public static void main(String args[]) {
		Apple ap;
		
		//display price of Winesap
		System.out.println("Winesap cost " + Apple.Winesap.getPrice() + "cents.\n");
		
		//display all apples adn rpices.
		System. out.println("All apple prices:");
		for(Apple a :Apple.values()) {
			System.out.println(a + "costs " + a.getPrice() + " cents.");
		}
		
		//usa values()
		Apple allapples[] =Apple.values();
		for (Apple a : allapples) {
			System.out.println(a);
		}
		System.out.println();
		
		//use valueof()
		ap = Apple.valueOf("Winesap");
		System.out.println("ap contains " + ap);
	}
}
