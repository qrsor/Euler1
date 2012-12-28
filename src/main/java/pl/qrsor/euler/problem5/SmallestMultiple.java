package pl.qrsor.euler.problem5;

public class SmallestMultiple {

	public int calculate() {
		for (int i = 1; i < Integer.MAX_VALUE; i++) {
			if (i % 2 == 0 && i % 3 == 0 && i % 4 == 0 && i % 5 == 0 && i % 6 == 0 && i % 7 == 0 && i % 8 == 0 && i % 9 == 0 && i % 10 == 0) {
				return i;
			}
		}
		throw new RuntimeException("Smallest multiple not found");
	}
}
