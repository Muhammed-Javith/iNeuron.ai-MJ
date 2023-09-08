package arraysassignment;
import java.util.Scanner;
class Quicksort 
{
	static int partition(int array[], int low, int high) 
	{
		int pivot = array[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) 
		{
			if (array[j] <= pivot) 
			{
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		return (i + 1);
	}
	static void quickSort(int array[], int low, int high) 
	{
		if (low < high) 
		{
			int pi = partition(array, low, high);
			quickSort(array, low, pi - 1);
			quickSort(array, pi + 1, high);
		}
	}
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of the elements want print in array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Elements Before Quick Sort");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		Quicksort.quickSort(arr, 0, n - 1);
		System.out.println("\nElements After Quick Sort");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		sc.close();
	}
}
