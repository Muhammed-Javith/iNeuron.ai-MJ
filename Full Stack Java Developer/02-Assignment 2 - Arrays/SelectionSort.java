package arraysassignment;

import java.util.Scanner;

public class SelectionSort 
{
	static void selectionsort(int arr[], int size) 
	{
		for (int i = 0 ;i< size-1; i++)
		{
			int min = i;
			for (int j = i+1; j<size; j++)
			{
				if (arr[j] < arr[min])
				{
					min = j;
		        }
		     }
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of the elements  in array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements Before Selection Sort");
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		SelectionSort.selectionsort(arr, size);
		System.out.println("\nElements After Selection Sort");
		for (int i = 0 ;i< size; i++)
			System.out.print(arr[i] + " ");
		sc.close();
	 }  
}