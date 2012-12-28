package pl.qrsor.euler.problem6;

import pl.qrsor.euler.AbstractSequenceIterator;
import pl.qrsor.euler.NumberSequence;

import java.util.Iterator;

public class NaturalNumberSquareSequence implements NumberSequence {
	private final int limit;
	private int index = 0;
	private int currentTermRoot = 0;

	public NaturalNumberSquareSequence(int limit) {
		this.limit = limit;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new NaturalNumberSquareIterator();
	}

	private class NaturalNumberSquareIterator extends AbstractSequenceIterator {
		@Override
		public boolean hasNext() {
			return index < limit;
		}

		@Override
		public Integer next() {
			index++;
			currentTermRoot++;
			return currentTermRoot * currentTermRoot;
		}
	}
}
