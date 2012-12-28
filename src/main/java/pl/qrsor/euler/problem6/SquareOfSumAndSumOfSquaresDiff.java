package pl.qrsor.euler.problem6;

import pl.qrsor.euler.ConditionalSum;
import pl.qrsor.euler.NumberSequence;
import pl.qrsor.euler.problem1.NaturalNumberSequence;

public class SquareOfSumAndSumOfSquaresDiff {
	private NumberSequence naturalNumbersSequence;
	private NumberSequence naturalNumberSquaresSequence;

	public SquareOfSumAndSumOfSquaresDiff(int limit) {
		naturalNumbersSequence = NaturalNumberSequence.createLimitedByIndex(limit);
		naturalNumberSquaresSequence = new NaturalNumberSquareSequence(limit);
	}

	public int calculate() {
		int sum = ConditionalSum.create(naturalNumbersSequence).calculate();
		int sumOfSquare = ConditionalSum.create(naturalNumberSquaresSequence).calculate();
		return sum * sum - sumOfSquare;
	}
}
