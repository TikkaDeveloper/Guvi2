/*24 - Given an array of integers, find two numbers such that they add up to a specific target number.
Input: numbers={2, 7, 11, 15}, target=9
*/
import java.util.*;
public class SubsetSum2Elem {
	static int setindex[];
	
	public static int subsetCall(int a[],int sum)
	{
		setindex=new int[2];
		int result=0;
		result=subsetSum(a,sum,0,setindex,0,0);
				return result;
	}
	
	public static int subsetSum(int[] a,int sum,int cursum,int[] setindex,int visitcount,int index)
	{
		if(sum==cursum && visitcount==2)
		{
			System.out.println("the terms which make up the target sum is "+setindex[0]+"and"+setindex[1]);
			return 1; 
		}
		else if(visitcount==2)
		{
			setindex[0]=setindex[1]=0;
			return 0;
		}
		else
		{
			for(int i=index;i<a.length;i++)
			{
				setindex[visitcount]=a[i];
				int result=subsetSum(a,sum,cursum+a[index],setindex,visitcount+1,i+1);
				if(result ==1)
				{
					return 1;
				}
				else
				setindex[visitcount]=-1;
			}
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the target sum");
		int sum=sc.nextInt();
		
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int result=subsetCall(a,sum);
		
		
		if(result!=1)
		{
			System.out.println("There are no elements that make up the target sum");
		}
	
		
		
	}

}
