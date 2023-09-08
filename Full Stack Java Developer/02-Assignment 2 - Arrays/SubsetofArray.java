package arraysassignment;

import java.util.Scanner;

public class SubsetofArray 
{
	static boolean isSubset(int arr1[], int arr2[], int n, int m)
	{
		int i = 0;
		int j = 0;
		for (i = 0; i < m; i++) 
		{
			for (j = 0; j < n; j++)
				if (arr2[i] == arr1[j])
					break;
			if (j == n)
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of the elements in first array");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter the Elements of first array");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter no of the elements in second array");
		int m = sc.nextInt();
		int arr2[] = new int[m];
		System.out.println("Enter the Elements of second array");
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}		
		if (isSubset(arr1, arr2, n, m))
			System.out.print("arr2[] is " + "subset of arr1[] ");
		else
			System.out.print("arr2[] is " + "not a subset of arr1[]");
		sc.close();
	}
}
