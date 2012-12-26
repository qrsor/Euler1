package pl.qrsor.euler.problem1;

public class Main {
	public static void main(String[] args) {
		int limit = 1000;
		int sum = new ConditionalSum(limit).calculate();
		System.out.println("Limit=" + limit + " ;Sum=" + sum);
	}
}
