package pl.qrsor.euler;

public interface Condition {

	/**
	 * Checks whether given number meets the condition
	 *
	 * @param number to be checked
	 * @return true if conditions is met. False otherwise.
	 */
	boolean metBy(int number);
}
