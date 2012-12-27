package pl.qrsor.euler.problem2;

import org.junit.Test;
import pl.qrsor.euler.Condition;
import pl.qrsor.euler.ConditionalSum;
import pl.qrsor.euler.DividableCondition;
import pl.qrsor.euler.NumberSequence;

import static org.fest.assertions.api.Assertions.assertThat;

public class FibonacciConditionalSumTest {
	@Test
	public void shouldReturn2GivenLimit3() {
		//given
		int limit = 3;
		NumberSequence sequence = new FibonacciSequence();
		Condition condition = new DividableCondition(2);
		ConditionalSum conditionalSum = new ConditionalSum(limit, sequence, condition);

		//when
		int sum = conditionalSum.calculate();

		//then
		assertThat(sum).isEqualTo(2);
	}
}
