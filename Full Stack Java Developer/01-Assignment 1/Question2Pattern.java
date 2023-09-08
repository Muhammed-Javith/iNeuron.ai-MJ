package assignment1;

public class Question2Pattern {
	public static void main(String[] args) {
	
//		Write a program to print
//			
//			1 1 1 1
//			2 2 2 2
//			3 3 3 3
//			4 4 4 4 

		int n = 4;
		int i, j, s;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				System.out.print(i + " ");
			}
			for (s = 1; s <= n; s++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
