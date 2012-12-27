package pl.qrsor.euler;

public class DividableCondition implements Condition {
	private int divisor;

	public DividableCondition(int divisor) {
		this.divisor = divisor;
	}

	@Override
	public boolean metBy(int number) {
		return number % divisor == 0;
	}
}
