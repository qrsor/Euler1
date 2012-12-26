package pl.qrsor.euler.problem2;

public class FibonacciConditionalSum {
	private int limit;

	public FibonacciConditionalSum(int limit) {
		this.limit = limit;
	}

	public int calculate() {
		int i0 = 1;
		int i1 = 1;
		int sum = 0;

		for (int current = 0; current < limit; ) {
			current = i0 + i1;
			if (current % 2 == 0) {
				sum += current;
			}
			i0 = i1;
			i1 = current;
		}
		return sum;
	}
}
