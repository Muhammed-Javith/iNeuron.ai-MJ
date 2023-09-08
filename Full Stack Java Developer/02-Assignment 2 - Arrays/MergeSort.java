package arraysassignment;
import java.util.Scanner;
class MergeSort 
{
	void merge(int array[], int p, int q, int r) 
	{
		int n1 = q - p + 1;
		int n2 = r - q;
		int L[] = new int[n1];
		int M[] = new int[n2];
		
		for (int i = 0; i < n1; i++)
			L[i] = array[p + i];
		for (int j = 0; j < n2; j++)
			M[j] = array[q + 1 + j];
		
		int i, j, k;
	    i = 0;
	    j = 0;
	    k = p;
	    while (i < n1 && j < n2) 
	    {
	    	if (L[i] <= M[j]) 
	    	{
	    		array[k] = L[i];
	    		i++;
	    	} 
	    	else 
	    	{
	    		array[k] = M[j];
	    		j++;
	    	}
	       k++;
	    }
	    while (i < n1) 
	    {
	      array[k] = L[i];
	      i++;
	      k++;
	    }
	    while (j < n2) 
	    {
	      array[k] = M[j];
	      j++;
	      k++;
	    }
	}
	void mergeSort(int array[], int left, int right) 
	{
		if (left < right) 
		{
			int mid = (left + right) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}
    }
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of the elements in array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements Before Merge Sort");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		MergeSort ms = new MergeSort();
		ms.mergeSort(arr, 0, n - 1);
		System.out.println("\nElements After Merge Sort");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i]+" ");
		sc.close();
    }
}