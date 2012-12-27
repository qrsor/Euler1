package pl.qrsor.euler.problem2;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FibonacciSequenceTest {
	@Test
	public void shouldReturnFirstElevenTermsOfFibonacciSequence() {
		//given
		FibonacciSequence sequence = new FibonacciSequence(100);

		//when
		int[] terms = {
				sequence.iterator().next(),
				sequence.iterator().next(),
				sequence.iterator().next(),
				sequence.iterator().next(),
				sequence.iterator().next(),
				sequence.iterator().next(),
				sequence.iterator().next(),
				sequence.iterator().next(),
				sequence.iterator().next(),
				sequence.iterator().next()
		};

		//then
		assertThat(terms).isEqualTo(new int[]{1, 2, 3, 5, 8, 13, 21, 34, 55, 89});

	}
}
