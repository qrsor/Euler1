package pl.qrsor.euler.problem6;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class SquareOfSumAndSumOfSquaresDiffTest {
	@Test
	public void shouldReturn2640GivenLimitOf11() {
		//given
		int limit = 10;
		SquareOfSumAndSumOfSquaresDiff diff = new SquareOfSumAndSumOfSquaresDiff(limit);

		//when
		int result = diff.calculate();

		//then
		assertThat(result).isEqualTo(2640);
	}
}
