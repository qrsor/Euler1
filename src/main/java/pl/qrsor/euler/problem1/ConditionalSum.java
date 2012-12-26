package pl.qrsor.euler.problem1;

public class ConditionalSum {
	private final int limit;

	public ConditionalSum(int limit) {
		this.limit = limit;
	}

	public int calculate() {
		int sum = 0;
		for (int i = 1; i < limit; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
