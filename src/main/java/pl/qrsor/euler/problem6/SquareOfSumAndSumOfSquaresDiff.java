package pl.qrsor.euler.problem6;

public class SquareOfSumAndSumOfSquaresDiff {
	private final int limit;

	public SquareOfSumAndSumOfSquaresDiff(int limit) {
		this.limit = limit;
	}

	public int calculate() {
		int sum = 0;
		int sumOfSquare = 0;
		for (int i = 0; i < limit; i++) {
			sum += i;
			sumOfSquare += i * i;
		}
		return sum * sum - sumOfSquare;
	}
}
