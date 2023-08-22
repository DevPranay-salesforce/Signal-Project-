package javaprogramms1;

//# Example: Searching for a specific number in a list and stopping the loop when found

public class SearchNumberInList {
	/*
	 * public static void main(String[] args) { int[] numbers = {5, 8, 12, 4,
	 * 7,3,32,4,42,34,34,242,324,12,42,6}; int searchNum1 = 324; boolean found =
	 * false;
	 * 
	 * for (int num : numbers) { if (num == searchNum1) { found = true; break; //
	 * Stops the loop when the desired number is found } }
	 * 
	 * if (found) { System.out.println("The number " + searchNum1 +
	 * " is in the list."); } else { System.out.println("The number " + searchNum1 +
	 * " is not in the list."); } } } public classThrowKeyword {
	 */
	public static void main(String[] args) {
		try {
			int age = 18;
			check1VotingAge(age);
		} catch (ArithmeticException e) {
			System.out.println("Age restriction to vote: " + e.getMessage());
		}
	}

	public static void check1VotingAge(int age) {
		if (age >= 18) {
			System.out.println("You are eligible to vote!!!!!!!!!!!!!!!!!!.");
		} else {
			throw new ArithmeticException("You must be 18 years or older to vote.");
		}
	}
}
