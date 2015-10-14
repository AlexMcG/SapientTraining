package mainpack;

public class Airplane extends Vehicle implements Flyer{

	@Override
	public void takeOff() {
		System.out.println("take off!");	
	}

	@Override
	public void land() {
		System.out.println("land!");	
	}

	@Override
	public void fly() {
		System.out.println("fly!");	
	}

}
