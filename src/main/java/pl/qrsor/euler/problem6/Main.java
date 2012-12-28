package pl.qrsor.euler.problem6;

public class Main {
	public static void main(String[] args) {
		int limit = 101;
		SquareOfSumAndSumOfSquaresDiff diff = new SquareOfSumAndSumOfSquaresDiff(limit);
		System.out.println("Squares of sum and sum of squares diff of first 100 natural numbers=" + diff.calculate());
	}
}
