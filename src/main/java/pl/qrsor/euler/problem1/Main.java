package pl.qrsor.euler.problem1;

import pl.qrsor.euler.Condition;
import pl.qrsor.euler.ConditionalSum;
import pl.qrsor.euler.DividableCondition;
import pl.qrsor.euler.NumberSequence;

public class Main {
	public static void main(String[] args) {

		int limit = 1000;
		NumberSequence sequence = new NaturalNumberSequence();
		Condition dividableBy3 = new DividableCondition(3);
		Condition dividableBy5 = new DividableCondition(5);

		int sum = new ConditionalSum(limit, sequence, dividableBy3, dividableBy5).calculate();
		System.out.println("Limit=" + limit + " ;Sum=" + sum);
	}
}
