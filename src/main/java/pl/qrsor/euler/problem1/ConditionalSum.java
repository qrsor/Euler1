package pl.qrsor.euler.problem1;

public class ConditionalSum {
	private final int limit;
	private int sum;

	public ConditionalSum(int limit) {
		this.limit = limit;
	}

	public int calculate() {
		resetSum();
		for (int i = 1; i < limit; i++) {
			if (numberMeetsCondition(i)) {
				incrementSumBy(i);
			}
		}
		return sum;
	}

	private void incrementSumBy(int i) {
		sum += i;
	}

	private void resetSum() {
		sum = 0;
	}

	private boolean numberMeetsCondition(int number) {
		return dividableBy3(number) || dividableBy5(number);
	}

	private boolean dividableBy5(int number) {
		return dividableBy(number, 5);
	}

	private boolean dividableBy3(int number) {
		return dividableBy(number, 3);
	}

	private boolean dividableBy(int number, int divisor) {
		return number % divisor == 0;
	}
}
