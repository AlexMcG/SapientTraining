package mainpack;

//Compute distance light travels using long variables.
class Light {
	public static void main(String args[]) {
		// approximate speed of light in miles per second
		final int lightspeed = 186000;
		final long days = 1000; // specify number of days here
		final long seconds = days * 24 * 60 * 60; // convert to seconds
		final long distance;

		distance = lightspeed * seconds; // compute distance

		System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.println(distance + " miles.");
	}
}