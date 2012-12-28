package pl.qrsor.euler.problem1;

import org.junit.Test;
import pl.qrsor.euler.NumberSequence;

import static org.fest.assertions.api.Assertions.assertThat;

public class NaturalNumberSequenceTest {
	@Test
	public void shouldReturn1AsFirstTerm() {
		//given
		NumberSequence sequence = NaturalNumberSequence.createLimitedByValue(1);

		//when
		int term = sequence.iterator().next();

		//then
		assertThat(term).isEqualTo(1);
	}

	@Test
	public void shouldReturn2AsSecondTerm() {
		//given
		NumberSequence sequence = NaturalNumberSequence.createLimitedByValue(2);

		//when
		sequence.iterator().next();
		int term = sequence.iterator().next();

		//then
		assertThat(term).isEqualTo(2);
	}

	@Test
	public void shouldReturnThreeItemsGivenLimitByIndex() {
		//given
		int index = 3;
		NumberSequence sequence = NaturalNumberSequence.createLimitedByIndex(index);
		int lastItem = 0;

		//when
		for (Integer number : sequence) {
			lastItem = number;
		}

		//then
		assertThat(lastItem).isEqualTo(3);

	}
}
