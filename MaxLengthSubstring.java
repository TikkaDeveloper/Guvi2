import java.util.*;
/*27 - String is given need to print maximum length of sub-string which is not palindrome
 *  - (posted by Arun prakash)
 * */
 
public class MaxLengthSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=sc.next();
		
		String temp="";
		int max=0;
		StringBuilder str2;
		String maxString="";
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
			  temp=str.substring(i,j);
			  str2=new StringBuilder(temp);
			  
			  if(max<temp.length() && !str2.reverse().equals(temp))
			  {
				  max=temp.length();
				  maxString=temp;
			  }
			}
		}
		
		System.out.println("The maximum length of a substring which is not a palindrome"+max+"and the string is "+maxString);
		
	
	}
	
	
	
	
	

}
