package pl.qrsor.euler.problem2;

import pl.qrsor.euler.NumberSequence;

public class FibonacciSequence implements NumberSequence {

	private int previous = 1;
	private int current = 1;

	@Override
	public int next() {
		int tmp = current;
		current = previous + current;
		previous = tmp;
		return tmp;
	}
}
