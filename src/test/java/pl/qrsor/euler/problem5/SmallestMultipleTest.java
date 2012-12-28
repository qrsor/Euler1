package pl.qrsor.euler.problem5;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class SmallestMultipleTest {
	@Test
	public void shouldReturn2540GivenLimitOf10() {
		//given
		SmallestMultiple smallestMultiple = new SmallestMultiple();

		//when
		int result = smallestMultiple.calculate();

		//then
		assertThat(result).isEqualTo(2520);
	}
}
