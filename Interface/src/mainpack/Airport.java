package mainpack;

public class Airport {
	public static void main(String[] args) {
		Airport metropolisAirport = new Airport();
		Helicopter copter = new Helicopter();
		Seaplane  sPlane = new Seaplane();
		
		metropolisAirport.givePermissionToLand(copter);
		metropolisAirport.givePermissionToLand(sPlane);
	}
	
	private void givePermissionToLand(Flyer f) {
		f.land();
	}
}
