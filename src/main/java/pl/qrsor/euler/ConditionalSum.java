package pl.qrsor.euler;

import java.util.Set;

import static com.google.common.collect.Sets.newHashSet;

public class ConditionalSum {
	protected final int limit;
	protected final NumberSequence sequence;
	protected final Set<Condition> conditions;
	protected int sum;

	public ConditionalSum(int limit, NumberSequence sequence, Condition... conditions) {
		this.limit = limit;
		this.sequence = sequence;
		this.conditions = newHashSet(conditions);
	}

	public int calculate() {
		resetSum();
		for (int number = sequence.next(); number < limit; number = sequence.next()) {
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
