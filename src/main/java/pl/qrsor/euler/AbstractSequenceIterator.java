package pl.qrsor.euler;

import java.util.Iterator;

public abstract class AbstractSequenceIterator implements Iterator<Integer> {
	@Override
	public void remove() {
		throw new UnsupportedOperationException("Removing items from a sequence is not supported");
	}
}
