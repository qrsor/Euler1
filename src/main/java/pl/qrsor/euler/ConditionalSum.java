package pl.qrsor.euler;

import java.util.Set;

import static com.google.common.collect.Sets.newHashSet;
import static org.apache.commons.lang3.ArrayUtils.isEmpty;

public class ConditionalSum {

	protected final NumberSequence sequence;
	protected final Set<Condition> conditions;
	protected int sum;

	private ConditionalSum(NumberSequence sequence, Condition... conditions) {
		this.sequence = sequence;
		this.conditions = newHashSet(conditions);
	}

	public static ConditionalSum create(NumberSequence sequence, Condition... conditions) {
		if (isEmpty(conditions)) {
			return new ConditionalSum(sequence, new AlwaysMetCondition());
		}
		return new ConditionalSum(sequence, conditions);
	}

	public int calculate() {
		resetSum();
		for (Integer number : sequence) {
			if (numberMeetsConditions(number)) {
				incrementSumBy(number);
			}
		}
		return sum;
	}

	protected boolean numberMeetsConditions(int number) {
		for (Condition condition : conditions) {
			if (condition.metBy(number)) {
				return true;
			}
		}
		return false;
	}

	protected void incrementSumBy(int i) {
		sum += i;
	}

	protected void resetSum() {
		sum = 0;
	}

	private static class AlwaysMetCondition implements Condition {
		@Override
		public boolean metBy(int number) {
			return true;
		}
	}
}
