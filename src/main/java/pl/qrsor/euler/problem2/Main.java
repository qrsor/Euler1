package pl.qrsor.euler.problem2;

public class Main {
	public static void main(String[] args) {
		int limit = 4000000;
		int sum = new FibonacciConditionalSum(limit).calculate();
		System.out.println("Limit=" + limit + " ;Sum=" + sum);
	}
}
