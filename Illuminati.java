public class Illuminati {
	
	public long triangleNumber(long seed) {
		
		if (seed < 1) {
			throw new IllegalArgumentException("Error: The starting integer must be at least 1!");
			System.exit(3);
		}
		
		return (seed * (seed + 1)) / 2;
	}
	
	public long lazyCaterer(long cuts) {
		
		if (cuts < 0) {
			throw new IllegalArgumentException("Error: The starting integer must be at least 0!");
			System.exit(3);
		}
		
		return (Math.pow(cuts, 2) + cuts + 2) / 2;
	}
}