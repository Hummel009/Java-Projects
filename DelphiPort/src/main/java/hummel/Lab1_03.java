package main.java.hummel;

import java.util.*;

public class Lab1_03 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter the number of elements: ");
		int n = input.nextInt();
		System.out.println();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter the element: ");
			arr[i] = input.nextInt();
		}

		HashSet<Integer> nums = new HashSet<>();
		for (int i = 0; i < n; i++) {
			nums.add(arr[i]);
		}

		System.out.println("Unique elements: " + nums);
		System.out.println("The quantity of unique elements: " + nums.size());

		int max = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr [j] && i != j) {
					max = arr[i];
					break;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr [j] && i != j && max < arr[i]) {
					max = arr[i];
				}
			}
		}
		System.out.println("Max duplicate: " + max);
	}
}