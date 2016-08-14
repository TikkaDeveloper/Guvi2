/*22 - Given an array A[n] of n numbers, 
 * create an output array such that Out[i] is equal to the product of all the elements of A[n] except A[i]. 
 * Ex. Out[4] assuming n >= 5 will be the product of the numbers from A[0] through A[3] and the numbers from A[5] through A[n - 1].
 *  Solve this without using the division operator and in O(n).
 */
import java.util.*;
public class ProductOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("Enter the size of the array");
		n=sc.nextInt();
		
		int a[]=new int[n];
		//Stores the cumulative product of the numbers in the array from the front
		int frontProd[]=new int[n];
		//Stores the cumulative product of the numbers in the array from the back
		int backProd[]=new int[n];
		
		int result[]=new int[n];
		
		//get array
		System.out.println("Enter the numbers in the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
			//Fill the frontProd by multiplying the number in the current index of the array while getting it ,with the previous index cumulative 
			//product of the frontProd.
			if(i==0)
			{
				frontProd[0]=a[0];
			}
			else{
				frontProd[i]=frontProd[i-1]*a[i];
				
			}
			
		}
		
		
		//fill up the backProd Cumulative array
		for(int i=n-1;i>=0;i--)
		{
			
			
			if(i==n-1)
			{
				backProd[i]=a[i];
			}
			else
			{
			//Fill the backProd by multiplying the number in the current index of the array while getting it ,with the previous index cumulative 
			//product of the backProd.
			backProd[i]=backProd[i+1]*a[i];
			}
			
		}
		
		
		
		
	
	
		//Cumulative result of the all the array elements except the current element
		for(int i=0;i<n;i++)
		{
			if(i==0)
			{
				//the first element of the result is the product of all elements in the array
				//except itself ,which is backProd[1]
				result[0]=backProd[1];
			}
			else if(i==n-1)
			{
				//the last element of the result should not contain its value of the input array
				result[i]=frontProd[i-1];
			}
			else
			{	
				//result is the product of the cumulative back and front arrays, which contains the cumulative product of all elements 
				//from back and front.
				result[i]=frontProd[i-1]*backProd[i+1];
			}
		}
		
		
		
		///PRINT
		System.out.println("The cumulative product result");
		for(int i=0;i<n;i++)
		{
			System.out.println(result[i]);
		}
		
		
	}

}
