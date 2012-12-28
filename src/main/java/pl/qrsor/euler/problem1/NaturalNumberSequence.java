package pl.qrsor.euler.problem1;

import pl.qrsor.euler.AbstractSequenceIterator;
import pl.qrsor.euler.NumberSequence;

import java.util.Iterator;

public class NaturalNumberSequence implements NumberSequence {

	private static final boolean LIMIT_BY_INDEX = true;
	private static final boolean LIMIT_BY_VALUE = false;

	private int currentTerm = 1;
	private int index = 0;
	private final int limit;
	private boolean limitByIndex;


	private NaturalNumberSequence(int limit, boolean limitByIndex) {
		this.limit = limit;
		this.limitByIndex = limitByIndex;
	}

	public static NaturalNumberSequence createLimitedByValue(int limit) {
		return new NaturalNumberSequence(limit, LIMIT_BY_VALUE);
	}

	@Override
	public Iterator<Integer> iterator() {
		return new SequenceIterator();
	}

	public static NaturalNumberSequence createLimitedByIndex(int index) {
		return new NaturalNumberSequence(index, LIMIT_BY_INDEX);
	}

	private class SequenceIterator extends AbstractSequenceIterator {
		@Override
		public boolean hasNext() {
			if (limitByIndex) {
				return index < limit;
			}
			return currentTerm < limit;
		}

		@Override
		public Integer next() {
			index++;
			return currentTerm++;
		}

	}
}
