public class nthFib {

	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);

	}

	static void testFib(int n) {
		long startTime = System.nanoTime(); // define algo start time
		fib(n);
		long endTime = System.nanoTime(); // define algo end time
		long totalTime = endTime - startTime; // calculate total algo runtime
		System.out.println("Running fib() at n = " + n + " is " + (totalTime) + "ns");
	}

	static int fib2(int n) {
		int f[] = new int[n + 2];

		f[0] = 0;
		if (n > 0) {
			f[1] = 1;

			for (int i = 2; i <= n; i++) {
				f[i] = f[i - 1] + f[i - 2];
			}
		}
		return f[n];
	}

	static void testFib2(int n) {
		long startTime = System.nanoTime(); // define algo start time
		fib2(n);
		long endTime = System.nanoTime(); // define algo end time
		long totalTime = endTime - startTime; // calculate total algo runtime
		System.out.println("Running fib2() at n = " + n + " is " + (totalTime) + "ns");
	}

	public static void main(String args[]) {

		testFib(40);
		testFib(45);
		testFib(50);
		System.out.println();
		testFib2(40);
		testFib2(45);
		testFib2(50);

	}
}