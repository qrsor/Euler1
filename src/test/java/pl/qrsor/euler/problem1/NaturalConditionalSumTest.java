package pl.qrsor.euler.problem1;

import org.junit.Test;
import pl.qrsor.euler.ConditionalSum;
import pl.qrsor.euler.DividableCondition;
import pl.qrsor.euler.NumberSequence;

import static org.fest.assertions.api.Assertions.assertThat;

public class NaturalConditionalSumTest {

	@Test
	public void shouldReturn23ForLimit10() {
		//given
		int limit = 10;
		NumberSequence sequence= NaturalNumberSequence.createLimitedByValue(limit);
		DividableCondition dividableBy3 = new DividableCondition(3);
		DividableCondition dividableBy5 = new DividableCondition(5);

		//when
		int sum = ConditionalSum.create(sequence, dividableBy3, dividableBy5).calculate();

		//then
		assertThat(sum).isEqualTo(23);
	}

}
