package javaprogramms1;

public class BubbleSortDescendingClass {

	// package com.techvidvan.bubblesort;
	// public class BubbleSortDemo {
	static void bubbleDescending(int[] myarray) {
		int n = myarray.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (myarray[j - 1] < myarray[j]) {
					// greater or smaller sign if [(myarray[j - 1] < myarray[j])] reflect to set
					// number in ascending or descending number.
					// Code to swap the elements.
					temp = myarray[j - 1];
					myarray[j - 1] = myarray[j];
					myarray[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int myarray[] = { 4, 15, 12, 21, 2, 25, 10, 4, 54, 100, 18 };

		System.out.println("Array on which we apply Bubble Sort: ");
		for (int i = 0; i < myarray.length; i++) {
			System.out.print(myarray[i] + " ");
		}
		System.out.println();

		bubbleDescending(myarray); // Applying Bubble sort to sort the Array

		System.out.println("Array after applying Bubble Sort: ");
		for (int i = 0; i < myarray.length; i++) {
			System.out.print(myarray[i] + " ");
		}
	}
}

/*
 * package javaprogramms1;
 * 
 * public class BubbleSortClass {
 * 
 * static void bubbleSort(int[] arr) { int n = arr.length; boolean swapped; for
 * (int i = 0; i < n - 1; i++) { swapped = false; for (int j = 0; j < n - i - 1;
 * j++) { if (arr[j] > arr[j + 1]) { // Swap the elements int temp = arr[j];
 * arr[j] = arr[j + 1]; arr[j + 1] = temp; swapped = true; } } // If no two
 * elements were swapped in the inner loop, the array is already sorted if
 * (!swapped) { break; } } }
 * 
 * public static void main(String[] args) { int[] myArray = {4, 15, 12, 21, 2,
 * 25, 10, 18};
 * 
 * System.out.println("Array before sorting: "); for (int num : myArray) {
 * System.out.print(num + " "); } System.out.println();
 * 
 * bubbleSort(myArray); // Applying Bubble sort to sort the Array
 * 
 * System.out.println("Array after applying Bubble Sort: "); for (int num :
 * myArray) { System.out.print(num + " "); } } }
 */
