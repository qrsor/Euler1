package pl.qrsor.euler.problem6;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class NaturalNumberSquareSequenceTest {
	@Test
	public void shouldReturn9LimitedByIndex() {
		//given
		int index = 3;
		NaturalNumberSquareSequence sequence = new NaturalNumberSquareSequence(index);
		int lastTerm = 0;

		//when
		for (Integer term : sequence) {
			lastTerm = term;
		}

		//then
		assertThat(lastTerm).isEqualTo(9);
	}
}
