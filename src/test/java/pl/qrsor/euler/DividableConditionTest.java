package pl.qrsor.euler;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class DividableConditionTest {
	@Test
	public void shouldReturnTrueForNumberDividableBy3() {
		//given
		int divisor = 3;
		DividableCondition condition = new DividableCondition(divisor);

		//when
		boolean result = condition.metBy(6);

		//then
		assertThat(result).isTrue();
	}

	@Test
	public void shouldReturnFalseForNumberNotDividableBy3() {
		//given
		int divisor = 3;
		DividableCondition condition = new DividableCondition(divisor);

		//when
		boolean result = condition.metBy(5);

		//then
		assertThat(result).isFalse();
	}
}
