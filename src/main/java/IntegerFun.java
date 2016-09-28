import sequences.Illuminati;

public class IntegerFun {
	
	public static void main(String[] args) {
		
		boolean mode = true;
		
		if (args.length != 2) {
			System.err.println("Error: Both a sequence and initial integer must be entered!");
			System.exit(1);
		}
		
		if (args[0].compareTo("lazy") == 0) {
			mode = true;
		}
		else if (args[0].compareTo("triangle") == 0) {
			mode = false;
		}
		else {
			System.err.println("Error: The sequence must be either \"lazy\" or \"triangle\"!");
			System.exit(1);
		}
		
		long initialInt = 0;
		initialInt = Long.parseLong(args[1]);
		
		if (initialInt > Integer.MAX_VALUE || initialInt < Integer.MIN_VALUE) {
			System.err.println("Error: The initial integer must be a 32-bit value!");
			System.exit(2);
		}
		
		if (mode) {
			long result = Illuminati.lazyCaterer(initialInt);
			
			if (result == -1) {
				System.err.println("Error: The starting integer must be at least 1!");
				System.exit(3);
			}
			
			System.out.printf("Lazy(%d) = %d\n", initialInt, result);
		}
		else {
			long result = Illuminati.triangleNumber(initialInt);
			
			if (result == -1) {
				System.err.println("Error: The starting integer must be at least 0!");
				System.exit(3);
			}
			
			System.out.printf("Tri(%d) = %d\n", initialInt, result);
		}
		
		System.exit(0);
	}
}