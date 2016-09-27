public class Illuminati {
	
	public int triangleNumber(int seed) {
		
		if (seed < 1) {
			throw new IllegalArgumentException("Error: The starting integer must be at least 1!");
			System.exit(1);
		}
		
		for (int i = seed - 1; i > 0; i--) {
			seed += i;
		}
		
		return seed;
	}
	
	public int lazyCaterer(int cuts) {
		
		return (Math.pow(cuts, 2) + cuts + 2) / 2;
	}
}