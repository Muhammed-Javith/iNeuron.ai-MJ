package arraysassignment;
import java.util.ArrayList;
import java.util.Scanner;
public class DuplicatesinArray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of the elements want print in array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean ifPresent = false;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < n - 1; i++) 
		{
			for (int j = i + 1; j < n; j++) 
			{
				if (arr[i] == arr[j]) 
				{
					if (al.contains(arr[i]))
						break;
					else
						al.add(arr[i]);
						ifPresent = true;
			    }
			}
		}
		if (ifPresent == true) 
			System.out.print(al + " ");
		else 
			System.out.print("No duplicates present in arrays");
		sc.close();
	}
}
