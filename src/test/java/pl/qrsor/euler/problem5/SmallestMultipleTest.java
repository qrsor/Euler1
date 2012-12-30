package pl.qrsor.euler.problem5;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class SmallestMultipleTest {
	@Test
	public void shouldReturn2540GivenLimitOf10() {
		//given
		int limit=10;
		SmallestMultiple smallestMultiple = new SmallestMultiple(limit);

		//when
		int result = smallestMultiple.calculate();

		//then
		assertThat(result).isEqualTo(2520);
	}

	@Test
	public void shouldReturn6GivenLimitOf3() {
		//given
		int limit = 3;
		SmallestMultiple smallestMultiple=new SmallestMultiple(limit);

		//when
		int result = smallestMultiple.calculate();

		//then
		assertThat(result).isEqualTo(6);
	}

	@Test
	public void shouldReturn12GivenLimitOf4() {
		//given
		int limit = 4;
		SmallestMultiple smallestMultiple=new SmallestMultiple(limit);

		//when
		int result = smallestMultiple.calculate();

		//then
		assertThat(result).isEqualTo(12);
	}
}
