package pl.qrsor.euler.problem1;

import org.junit.Test;
import pl.qrsor.euler.NumberSequence;

import static org.fest.assertions.api.Assertions.assertThat;

public class NaturalNumberSequenceTest {
	@Test
	public void shouldReturn1AsFirstTerm() {
		//given
		NumberSequence sequence = new NaturalNumberSequence();

		//when
		int term = sequence.next();

		//then
		assertThat(term).isEqualTo(1);
	}

	@Test
	public void shouldReturn2AsSecondTerm() {
		//given
		NumberSequence sequence = new NaturalNumberSequence();

		//when
		sequence.next();
		int term = sequence.next();

		//then
		assertThat(term).isEqualTo(2);
	}
}