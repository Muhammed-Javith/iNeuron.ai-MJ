package org.javaFoundation.Assignment;

public class TeluskoPattern {
	public static void main(String[] args) {
		//Printing Telusko
		int n =10;
		int s;		
//1. Printing T
		for(int i =1; i<=n; i++)
		{
			for (int j=1;j<=n; j++)
			{
				if(i == 1 || j == n/2  )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(s=1;s<=3;s++)
				System.out.print(" ");
//2. Printing E
			for (int j = 1; j <= n; j++)
				if (i == 1 && j <=n || i == n/2 && j <=10 || i == n && j <=n || j == 1)
					System.out.print("*");
				else
					System.out.print(" ");
			for(s=1;s<=3;s++)
				System.out.print(" ");
//3. Printing L
			for (int j=1;j<=n; j++)
				if(j == 1 || i == n  )
					System.out.print("*");
				else
					System.out.print(" ");
			for(s=1;s<=3;s++)
				System.out.print(" ");
//4. Printing U
			for (int j = 1; j <= n; j++)
				if (j == 1 && i <=n || i == n || j == n && i <=n)
					System.out.print("*");
				else
					System.out.print(" ");
			for(s=1;s<=3;s++)
				System.out.print(" ");
//5. Printing S
			for (int j = 1; j <= n; j++)
				if ((i == 1 || i == n/2 || i ==  n ) || (j == 1 && i <= n/2) || (j == n  && i >= n/2) )
					System.out.print("*");
				else
					System.out.print(" ");
			for(s=1;s<=3;s++)
				System.out.print(" ");
//6. Printing K			
			for (int j = 1; j <= n; j++)
				//if (j == 1 && i <=n || i - j+1 == n/2 || i+ j-1 == n/2) 
				if (j == 1 && i <=n || i - j+1 == n/2 || i+ j-1 == n/2+1 )
					System.out.print("*");
				else
					System.out.print(" ");
			for(s=1;s<=3;s++)
				System.out.print(" ");
//7. Printing O
			for (int j = 1; j <= n; j++)
				if (i == 1 && j >= 1 && j <= n|| i == n && j > 1 && j <=n || j == 1 && i > 1 && i <=n
						|| j == n  && i > 1 && i <=n)
					System.out.print("*");
				else
					System.out.print(" ");
			for(s=1;s<=3;s++)
				System.out.print(" ");
			System.out.println();
		}
	}


}
