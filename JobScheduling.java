import java.util.*;
public class JobScheduling {
	
	public static int[][] sort(int a[][],int n)
	{
		int temp1=0,temp2=0;
		for(int i=n;i>=0;i--)
		{
			for(int j=0;j<i-1;j++)
			{
				if(a[j][1]>a[j+1][1])
				{
					temp1=a[j][0];
					temp2=a[j][1];
					
					a[j][0]=a[j+1][0];
					a[j][1]=a[j+1][1];
					
					a[j+1][0]=temp1;
					a[j+1][1]=temp2;
					
				
					
				}
			}
		}
		
		for(int l=0;l<n;l++)
		{
			System.out.println(a[l][1]);
		}
		return a;
	}

	public static int maxmeet(int fin[][],int n)
	{
		int i,j;
		System.out.println("The following activities are selected");
		
		i=0;
		System.out.println(i);
		int count=0;
		
		for(j=1;j<n;j++)
		{
			if(fin[j][0]>=fin[i][1])
			{
				System.out.println(j);
				i=j;
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the size Available meetings");
		int n=sc.nextInt();
		
		int start[]=new int[n];
		int fin[][]=new int[n][2];
		
		int resFin[][];
		
		System.out.println("Enter the starting time and finshing time");
		
		for(int i=0;i<n;i++)
		{
			
			
			
			fin[i][0]=sc.nextInt();
			fin[i][1]=sc.nextInt();
	
		}

		resFin=sort(fin,n);
		
		int max=maxmeet(resFin,n);
		System.out.println("The maximum number of meetings that can be held "+max);
		
		
	}

}
