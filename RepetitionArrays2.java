import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RepetitionArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int k;
		System.out.println("Enter the number of arrays");
		k=sc.nextInt();
		int v=0,tempi,tempj,temp,count=0;
		
		System.out.println("Enter the size of arrays");
		int n=sc.nextInt();
		
		List<Integer> a[]=(List<Integer>[])new ArrayList[k];
		
		for(int i=0;i<k;i++)
		{
			a[i]=new ArrayList<>();
			for(int j=0;j<n;j++)
			{
				
				a[i].add(j,sc.nextInt());
			}
		}
		
		for(int i=0;i<k;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				
				temp=a[i].get(j);
				count=0;
				for(int l=0;l<k;l++)
				{
					
					if(a[l].contains(temp))
					{
						count++;
					}
				}
				if(count>1)
				{
					System.out.println(temp+" is repeating");
				}
				
			}
		}
		
		

	}

}
