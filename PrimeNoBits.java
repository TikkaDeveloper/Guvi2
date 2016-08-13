import java.util.*;
public class PrimeNoBits {
	
	public static  String intToBits(int n,int base)
	{
		
				String binary = "";
				int number=n;
			    //int temp = number/2+1;
			    while(number!=0)
			    {
			    	try {
			            binary += "" + number % base;
			
			            number /= base;
			        } catch (Exception e) {
			        }
			    }
			    StringBuffer s=new StringBuffer(binary);
			    System.out.println("The bits for "+n+" is "+s.reverse());
			    return String.valueOf(s.reverse());
	
	}
	public static int noOfOnes(String str)
	{
		int n=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='1')
			{
				n++;
			}
		}
		return n;
	}
	public static Boolean isPrime(int n)
	{
		Boolean isPrime=true;
		
		for(int j=2;j<n;j++)
		{
			if(n%j==0)
			{
				isPrime=false;
				break;
			}
		}
		
		return isPrime;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		
		int number=0;
		int no=0;
		String bitString="";
		boolean prime=false;
		
		
		System.out.println();
		
		for(int i=a1;i<=a2;i++)
		{
			bitString=intToBits(i,2);
			no=noOfOnes(bitString);
			prime=isPrime(no);
			if(prime)
			{
				System.out.println(i+" has "+no+" bits of 1's ,which is a prime number");
			}
		}

		
	}

}
