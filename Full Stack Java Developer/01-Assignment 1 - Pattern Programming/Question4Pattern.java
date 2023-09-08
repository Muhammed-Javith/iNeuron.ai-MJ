package assignment1;

public class Question4Pattern {

	public static void main(String[] args) {
		
//		Write a program to print
//		
//			*           *
//			**         **
//			***       ***
//			****     ****
//			*****   *****
//			****** ******
//			*************
//	   
		
		int n = 13;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 && i > (n - 1) / 2 || i == n - 1 || j == n - 1 && i > (n - 1) / 2 || i - j >= (n - 1) / 2
						|| i + j >= n - 1 + (n - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
