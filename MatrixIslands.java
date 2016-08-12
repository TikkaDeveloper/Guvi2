/*18 - Given a 2D matrix M, filled with either 0s or 1s, count the number of islands of 1s in M. An island is a group of adjacent values that are all 1s. Every cell in M can be adjacent to the 4 cells that are next to it on the same row or column.
ex: the matrix below has 6 islands: 
0 1 0 1 0
0 0 1 1 1
1 0 0 1 0
0 1 1 0 0
1 0 1 0 1*/
import java.util.*;
public class MatrixIslands {
	
	public static int[][] markindices(int visited[][],int i,int j,int a[][],int n)
	{
	
		//these four if's check whether the this element's neighbour element contains 1,if yes it belongs to the same island 
		//and call markindices for those neighbouring cells to explore those cells .
		
		if(i-1>=0 && a[i-1][j]==1 && visited[i-1][j]!=1 )
		{
			//adding it to the visited list ,so that it does count as a seperate island
			visited[i-1][j]=1;
			//calling the neighbour vertex to explore it and check if it has some neighbouring elements set
			//to 1 ,if yes it belongs to the same island and the variable count of the function island
			//need not be incremented as it belongs to the same island
			visited=markindices(visited,i-1,j,a,n);
		}
		if(i+1<n && a[i+1][j]==1 && visited[i+1][j]!=1 )
		{
			visited[i+1][j]=1;
			visited=markindices(visited,i+1,j,a,n);

		}
		if(j-1>=0 &&  a[i][j-1]==1 && visited[i][j-1]!=1 )
		{
			visited[i][j-1]=1;
			visited=markindices(visited,i,j-1,a,n);


		}
		if(j+1<n && a[i][j+1]==1  && visited[i][j+1]!=1 )
		{
			visited[i][j+1]=1;
			visited=markindices(visited,i,j+1,a,n);

		}
		return visited;
		
	}
	public static int  islands(int a[][],int n)
	{
		int visited[][]=new int[n][n];
		//this variable counts the no of islands
		int count=0;
		
		//go through all elements in the matrix
		System.out.println("the visited vertices are");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				//if the element contains 1 and it is not visited already, if it is visited, it means that it already belongs to another island 
				//so doesnt increment the count variable
				if(a[i][j]==1 && visited[i][j]!=1)
				{
					//calling it to explore the neigbouring cells to check they belong to this island
					visited=markindices(visited,i,j,a,n);
					System.out.println(i+","+j);
					
					//increment the 
					count ++;
					
				}
			}
		}
		
		
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the 2D matrix size");
		int n=sc.nextInt();
		
		System.out.println("Enter the 2D matrix");
		int a[][]=new int[n][n];
		int count=0;
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		count=islands(a,n);
		System.out.println("The number of islands in the matrix is "+count);
		
		
		
	}

}
