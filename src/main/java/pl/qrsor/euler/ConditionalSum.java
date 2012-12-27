package pl.qrsor.euler;

import java.util.Set;

import static com.google.common.collect.Sets.newHashSet;

public class ConditionalSum {
	protected final NumberSequence sequence;
	protected final Set<Condition> conditions;
	protected int sum;

	public ConditionalSum(NumberSequence sequence, Condition... conditions) {
		this.sequence = sequence;
		this.conditions = newHashSet(conditions);
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
		for(Condition condition : conditions) {
			if(condition.metBy(number)) {
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
}
