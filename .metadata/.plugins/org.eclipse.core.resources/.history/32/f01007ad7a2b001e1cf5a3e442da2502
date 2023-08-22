package javaprogramms1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//java programms1144
public class DuplicateRecords {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 4);

		Set<Integer> uniqueNumbers = new HashSet<Integer>();
		Set<Integer> duplicateNumbers = new HashSet<Integer>();

		for (int number : numbers) {
			if (!uniqueNumbers.add(number)) {
				duplicateNumbers.add(number);
			}
		}

		System.out.println("Duplicate numbers: " + duplicateNumbers);
	}
}
