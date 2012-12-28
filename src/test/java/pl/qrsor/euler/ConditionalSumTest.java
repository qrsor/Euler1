package pl.qrsor.euler;

import org.junit.Test;
import pl.qrsor.euler.problem1.NaturalNumberSequence;

import static org.fest.assertions.api.Assertions.assertThat;

public class ConditionalSumTest {
	@Test
	public void shouldSumAllItemsGivenNoConditions() {
		//given
		NumberSequence sequence = NaturalNumberSequence.createLimitedByValue(5);
		ConditionalSum conditionalSum = ConditionalSum.create(sequence);

		//when
		int sum = conditionalSum.calculate();

		//then
		assertThat(sum).isEqualTo(10);
	}
}
