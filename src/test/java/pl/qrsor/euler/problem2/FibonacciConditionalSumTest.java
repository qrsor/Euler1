package pl.qrsor.euler.problem2;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FibonacciConditionalSumTest {
	@Test
	public void shouldReturn2GivenLimit3() {
		//given
		int limit = 3;

		//when
		int sum = new FibonacciConditionalSum(limit).calculate();

		//then
		assertThat(sum).isEqualTo(2);
	}
}
