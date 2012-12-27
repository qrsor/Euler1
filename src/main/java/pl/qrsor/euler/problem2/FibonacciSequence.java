package pl.qrsor.euler.problem2;

import pl.qrsor.euler.NumberSequence;

import java.util.Iterator;

public class FibonacciSequence implements NumberSequence
{

	private int previous = 1;
	private int current = 1;
	private final int limit;

	public FibonacciSequence(int limit) {
		this.limit = limit;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new FibonacciSequenceIterator();
	}

	private class FibonacciSequenceIterator implements Iterator<Integer> {
		@Override
		public boolean hasNext() {
			return current<limit;
		}

		@Override
		public Integer next() {
			int tmp = current;
			current = previous + current;
			previous = tmp;
			return tmp;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("Returning terms from a sequence is not supported");
		}
	}
}
