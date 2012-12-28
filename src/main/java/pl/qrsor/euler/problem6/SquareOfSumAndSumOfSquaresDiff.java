package pl.qrsor.euler.problem6;

import pl.qrsor.euler.NumberSequence;
import pl.qrsor.euler.problem1.NaturalNumberSequence;

public class SquareOfSumAndSumOfSquaresDiff {
	private NumberSequence sequence;

	public SquareOfSumAndSumOfSquaresDiff(int limit) {
		sequence = new NaturalNumberSequence(limit);
	}

	public int calculate() {
		int sum = 0;
		int sumOfSquare = 0;
		for (Integer number : sequence) {
			sum += number;
			sumOfSquare += number * number;
		}
		return sum * sum - sumOfSquare;
	}
}
