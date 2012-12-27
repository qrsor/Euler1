package pl.qrsor.euler.problem1;

import pl.qrsor.euler.NumberSequence;

import java.util.Iterator;

public class NaturalNumberSequence implements NumberSequence {

	private int currentTerm = 1;
	private final int limit;

	public NaturalNumberSequence(int limit) {
		this.limit = limit;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new SequenceIterator();
	}

	private class SequenceIterator implements Iterator<Integer> {
		@Override
		public boolean hasNext() {
			return currentTerm < limit;
		}

		@Override
		public Integer next() {
			return currentTerm++;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("Removing items from a sequence is not supported");
		}
	}
}
