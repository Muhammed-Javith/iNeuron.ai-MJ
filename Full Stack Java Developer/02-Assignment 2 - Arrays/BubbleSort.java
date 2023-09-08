package arraysassignment;

import java.util.Scanner;

public class BubbleSort {
	static void bubbleSort(int arr[], int n) 
	{
		int i, j, temp;
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		}
	}
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of the elements in array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements Before Bubble Sort");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		bubbleSort(arr, n);
		System.out.println("\nElements After Bubble Sort");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		sc.close();
	}
}
