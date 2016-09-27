public class IntegerFun {
	
	public static void main(String[] args) {
		
		boolean mode = true;
		
		if (args.length != 2) {
			throw new IllegalArgumentException("Error: Both a sequence and initial integer must be entered!");
			System.exit(1);
		}
		
		if (args[0].compareTo("lazy") == 0) {
			mode = true;
		}
		else if (args[0].compareTo("triangle") == 0) {
			mode = false;
		}
		else {
			throw new IllegalArgumentException("Error: The sequence must be either \"lazy\" or \"triangle\"!");
			System.exit(1);
		}
		
		long intialInt = 0;
		initialInt = Long.parseLong(args[1]);
		
		if (long > Integer.MAX_VALUE || long < Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Error: The initial integer must be a 32-bit value!");
			System.exit(2);
		}
		
		if (mode) {
			long result = Illuminati.lazyCaterer(initialInt);
			System.out.printf("Tri(%d) = %d\n", initialInt, result);
		}
		else {
			long result = Illuminati.triangleNumber(intialInt);
			System.out.printf("Lazy(%d) = %d\n", initialInt, result);
		}
		
		System.exit(0);
	}
}