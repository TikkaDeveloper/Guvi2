/*21 - Given a NxN matrix filled with 0s and 1s, set every row that contains a 0 to all 0's and every column that contains a 0 to all 0's. Optimize for space and passes.
ex: 0 1 0 1 0
1 1 1 1 1
1 1 1 1 1
0 1 1 1 0
0 1 0 1 0
Results in
0 0 0 0 0
0 1 0 1 0
0 1 0 1 0
0 0 0 0 0
0 0 0 0 0
*/
/*author- Abishek chiffon
 */
import java.util.*;
public class MakeMatrixZeroes {
	
	
	public static int[][] makeZero(int a[][],int row,int column)
	{
		//making all columns of the particular row into zero
		for(int j=0;j<=column;j++)
		{
			a[row][j]=0;
		}
		//making all rows of the particular column into zero
		for(int i=0;i<=row;i++)
		{
			a[i][column]=0;
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the size of arrays");
		int n=sc.nextInt();
		
		int a[][]=new int[n][n];
		
		//the visited rows and columns indicate that they are made into zeroes and need not be visited again
		
		System.out.println("Enter the matrix");
		//get matrix
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		//make into zeroes
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//go in only if the cell has zero and if the row and column has not already been marked as made into zeroes
				//if we dont do this ,the cell which is made into zero will in turn make its row and column into zeros,
				//thus also making the whole matrix into zero
				if(a[i][j]==0 )
				{/*
					colVisited[i]=1;
					rowVisited[j]=1;*/
					a=makeZero(a,i,j);
				}
			/*	else if(a[i][j]==0)
				{
					if(colVisited[j]!=1 && rowVisited[i]==1)
					{
						a=makeZero(a,-1,j);
					}
					else if(colVisited[j]==1 && rowVisited[i]!=1)
					{
						a=makeZero(a,i,-1);
					}
				}*/
			}
		}
		
		
		//Print the matrix which is processed
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
