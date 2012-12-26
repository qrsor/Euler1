package pl.qrsor.euler.problem1;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class ConditionalSumTest {

	@Test
	public void shouldReturn23ForLimit10() {
		//given
		int limit = 10;

		//when
		int sum = new ConditionalSum(limit).calculate();

		//then
		assertThat(sum).isEqualTo(23);
	}

	@Test
	public void shouldReturn233168GivenLimit1000(){
		//given
		int limit = 1000;

		//when
		int sum = new ConditionalSum(limit).calculate();

		//then
		assertThat(sum).isEqualTo(233168);
	}
}
