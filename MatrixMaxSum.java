/*23 - A board has n*m cells, and there is a gift with some value (value is greater than 0) in every cell. 

 * You can get gifts starting from the top-left cell, and move right or down in each step, 
 * and finally reach the cell at the bottom-right cell. What’s the maximal value of gifts you can get from the board?
"1"	 10 3 	 8
"12" 2 	9 	 6
"5" "7" 4 	 11
3 	"7" "16" "5"
ex: the maximal value of gift from the board above is 53, and the path is highlighted in quotes.
1 10 3 8
12 2 9 6
5 7 4 11
3 7 16 5
*/
import java.util.*;
	class pair{
		int i;
		int j;
		pair(int row,int col)
		{
			i=row;
			j=col;
		}
	}
public class MatrixMaxSum {

	
	//static LinkedHashMap<Integer,Integer> maxlist=new LinkedHashMap<Integer,Integer>();
	static String maxlist=new String();
	static int maxsum=0;

	
	public static int maxSumCall(int a[][])
	{
		//LinkedHashMap<Integer,Integer> s=new LinkedHashMap<Integer,Integer>();
		String s=new String();
		maxlist="";
		
		
		int sum= maxSum(a,s,0,a.length-1,0,0);
		System.out.println("the traversal to make the maximum sum in the matrix is");
		
		System.out.println(maxlist);
		return sum;
	}
	
	public static int maxSum(int a[][],String curlist,int cursum,int asize,int row,int col)
	{
		if(row >asize || col >asize)
		{
			return cursum;
		}
		if(row==asize && col==asize)
		{
			cursum=cursum+a[row][col];
			curlist=curlist+row+" "+col+"\n";
			if(cursum>maxsum)
			{
				maxsum=cursum;
				maxlist=new String();
				maxlist=curlist;
				curlist=new String();
				System.out.println("varying max - "+maxsum);
			}
			return cursum;
		}
		else
		{	
			
			
			cursum=cursum+a[row][col];
			curlist=curlist+row+" "+col+"\n";
			
			int downsum	= maxSum(a,curlist,cursum,a.length-1,row+1,col);
			int rightsum=maxSum(a,curlist,cursum,a.length-1,row,col+1);
		
			
			return downsum>rightsum ? downsum:rightsum;
		}
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=0;
		int resultmax=0;
		
		System.out.println("Enter the size of the matrix");
		n=sc.nextInt();
		int a[][]=new int[n][n];
		
		System.out.println("enter the matrix");
		//get matrix
				for(int i=0;i<n;i++)
				{
					for(int j=0;j<n;j++)
					{
						a[i][j]=sc.nextInt();
					}
				}
				
				resultmax=maxSumCall(a);
				System.out.println("The maximum that can be obtained is - "+resultmax);
		
	}

}
