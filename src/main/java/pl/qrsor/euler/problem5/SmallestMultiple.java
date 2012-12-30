package pl.qrsor.euler.problem5;

public class SmallestMultiple {

	private final int limit;

	public SmallestMultiple(int limit) {
		this.limit = limit;
	}

	public int calculate() {
		for (int i = limit; i < Integer.MAX_VALUE; i++) {
			for (int j = 2; j <= limit; j++) {
				if (i % j != 0) {
					break;
				}
				if (j == limit) {
					return i;
				}
			}
		}
		throw new RuntimeException("Smallest multiple not found");
	}
}
