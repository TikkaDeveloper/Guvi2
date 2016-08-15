import java.util.*;
//13 - A singly linked list is filled a character in each node. Write a function to determine if the linked list is a palindrome


public class LinkedListPalindrome {
		char ch;
		LinkedListPalindrome next;
		static LinkedListPalindrome tail;
		
		public LinkedListPalindrome insert(LinkedListPalindrome head,char ch)
		{
			if(head==null)
			{
				head=new LinkedListPalindrome();
				head.ch=ch;
				head.next=null;
				tail=head;
			}
			else
			{
				LinkedListPalindrome p=head;
			
				LinkedListPalindrome newE=new LinkedListPalindrome();
				while(p.next!=null)
				{
					p=p.next;
				}
				p.next=newE;
				newE.ch=ch;
				newE.next=null;
				tail=newE;
				
			}
			return head;
			
		}
	
		
	public LinkedListPalindrome reverse(LinkedListPalindrome head)
	{
		LinkedListPalindrome next=new LinkedListPalindrome();
		LinkedListPalindrome prev=null;
		LinkedListPalindrome current=head;
		while(current!=null)
		{
		
	
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		
		current=prev;
		return current;
	}
	
	public void print(LinkedListPalindrome head,String inString)
	{ 		LinkedListPalindrome current=head;
		String str="";
			while(current!=null)
			{
				str=str+String.valueOf(current.ch);
				System.out.print(current.ch);
				current=current.next;
				
			}
			if(str.equals(inString))
			{
				System.out.println("\nSo they are palindrome");
			}
			else
			{
				System.out.println("\nSo they are not palindrome");
			}
			
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String inString=sc.nextLine();
		char ch[]=inString.toCharArray();
		LinkedListPalindrome head=null;
		LinkedListPalindrome obj=new LinkedListPalindrome();
		
		for(int i=0;i<ch.length;i++)
		{
		

			head=obj.insert(head, ch[i]);
		}
		
		head=obj.reverse(head);
		System.out.println("The reverse of the entered string");
		obj.print(head,inString);
		
		
	}

}
