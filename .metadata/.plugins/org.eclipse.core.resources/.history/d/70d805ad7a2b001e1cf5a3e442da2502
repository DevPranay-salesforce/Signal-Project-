package javaprogramms1;

import java.util.Arrays;

public class ArrayMixClass {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4 };
		String[] array2 = { "sam", "ram", "shyam", "rahul" };

		System.out.println("First Array is: " + Arrays.toString(array1));
		System.out.println("Second Array is: " + Arrays.toString(array2));

		// Converting the integer array to a string array
		String[] array1Str = new String[array1.length];
		for (int i = 0; i < array1.length; i++) {
			array1Str[i] = Integer.toString(array1[i]);

		}

	

		// Merging the string arrays
		String[] result = new String[array1Str.length + array2.length];
		System.arraycopy(array1Str, 0, result, 0, array1Str.length);
		System.arraycopy(array2, 0, result, array1Str.length, array2.length);

		System.out.println("The resulting array after merging two arrays is: " + Arrays.toString(result));
	}
}
