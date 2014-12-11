package ch5;

/**
 * Parity of a large number with 64-bit words
 */
public class Ex51 {
	public static void main(String[] args) {
		String[] numbers = new String[]{"0", "1", "-2", "4", "6", "8", "10", 
				"20", "30", "122", "143", "259" };
		
		for(String number : numbers) {
			System.out.printf("%s (%s): %b\n", number, Long.toBinaryString(Long.valueOf(number)), isPair(number));
		}
		
	}
	
	private static boolean isPair(String argNumber) {
		long x = Long.valueOf(argNumber);
		
		long is1;
		long isPair = 1;
		while(x != 0) {
			is1 = x & 1;
			isPair ^= is1;
			
			x = x >>> 1;
		}
		
		return isPair == 1;
	}
}
