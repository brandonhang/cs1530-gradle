package sequences;

public class Illuminati {
	
	public static long triangleNumber(long seed) {
		
		if (seed < 1) {
			return -1;
		}
		
		return (seed * (seed + 1)) / 2;
	}
	
	public static long lazyCaterer(long cuts) {
		
		if (cuts < 0) {
			return -1;
		}
		
		return (long)((cuts * cuts) + cuts + 2) / 2;
	}
}