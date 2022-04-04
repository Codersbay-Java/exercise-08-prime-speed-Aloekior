package application;

public class Main {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int[] primes = null; // replace with correct call
		long end = System.currentTimeMillis();
		
		for (int prime : primes) {
			System.out.print(prime + " ");
		}

		System.out.println();
		System.out.println("It took " + ((end - start) / 1000) + " seconds");
	}
}
