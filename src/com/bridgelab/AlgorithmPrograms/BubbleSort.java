package com.bridgelab.AlgorithmPrograms;

import java.util.Arrays;

public class BubbleSort {

	static void bubbleSort(int array[]) {
		int size = array.length;

		for (int i = 0; i < size - 1; i++) // loop to access each array element

			for (int j = 0; j < size - i - 1; j++) // loop to compare array elements

				// compare two adjacent elements
				if (array[j] > array[j + 1]) { // change > to < to sort in descending order

					int temp = array[j]; // swapping occurs if elements
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
	}

	public static void main(String args[]) {

		int[] num = { 62, 42, 32, 11, 52 };

		bubbleSort(num); // call method using class name

		System.out.println("Sorted Array in Ascending Order:");
		System.out.println(Arrays.toString(num));
	}

}
