// Java program to print all primes smaller than or equal to n using Sieve of Eratosthenes

class SieveOfEratosthenes {
	static void sieveOfEratosthenes(int n)
	{
		// Create a boolean array and initially mark them to be true. As the algorithm processes, we mark the composites false.
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++)
		{
			if (prime[p] == true)
			{
				// Update all multiples of p
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}

		// Print all prime numbers
		for (int i = 2; i <= n; i++)
		{
			if (prime[i] == true)
				System.out.print(i + " ");
		}
	}

	public static void main(String args[])
	{
		int n = 30;
		System.out.print(
			"Following are the prime numbers ");
		System.out.println("smaller than or equal to " + n);
		sieveOfEratosthenes(n);
	}
}
