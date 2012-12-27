package pl.qrsor.euler.problem2;

import pl.qrsor.euler.Condition;
import pl.qrsor.euler.ConditionalSum;
import pl.qrsor.euler.DividableCondition;
import pl.qrsor.euler.NumberSequence;

public class Main {
	public static void main(String[] args) {
		int limit = 4000000;
		NumberSequence sequence = new FibonacciSequence();
		Condition condition = new DividableCondition(2);
		int sum = new ConditionalSum(limit, sequence, condition).calculate();
		System.out.println("Limit=" + limit + " ;Sum=" + sum);
	}
}
