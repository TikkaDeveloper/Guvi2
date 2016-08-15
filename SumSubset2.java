
import java.util.Scanner;

public class SumSubset2 {
		public static void sumOfSubset(int a[],int setIndex[],int index,int sum,int currSum)
		{
			if(currSum<=sum)
			{	
			if(currSum==sum)
			{
				System.out.println("The subset is and index is"+index);

				for(int i=0;i<a.length;i++ )
				{
					if(setIndex[i]==1)
					{
						System.out.print(a[i]);
					}
				}
				
			}
			else if(index==a.length)
			{
				return ;
			}
			else
			{
		
				for(int i=index;i<a.length;i++)
				{
					setIndex[i]=1;
					sumOfSubset(a,setIndex,i+1,sum,currSum+a[i]);
					setIndex[i]=0;
					//sumOfSubset(a,setIndex,i,sum,currSum);
				}
				
			}
			}
			
			
		}	
	public static void main(String[] args) {
		int n=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No of numbers");
		n=sc.nextInt();
		int a[]=new int[n];
		int samp[]=new int[n];
		System.out.println("Enter the Numbers");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			samp[i]=0;
		}
		System.out.println("Enter the sum");
		int sum=sc.nextInt();
		sumOfSubset(a,samp,0,sum,0);
		
		
		
		
		
		
		
		

	}

}
