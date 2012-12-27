package pl.qrsor.euler.problem1;

import pl.qrsor.euler.NumberSequence;

public class NaturalNumberSequence implements NumberSequence {

	private int currentTerm = 1;

	@Override
	public int next() {
		return currentTerm++;
	}
}
