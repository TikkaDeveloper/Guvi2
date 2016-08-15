import java.util.*;



public class ReverseLinkedList {
		char ch;
		ReverseLinkedList next;
		static ReverseLinkedList tail;
		
		public ReverseLinkedList insert(ReverseLinkedList head,char ch)
		{
			if(head==null)
			{
				head=new ReverseLinkedList();
				head.ch=ch;
				head.next=null;
				tail=head;
			}
			else
			{
				ReverseLinkedList p=head;
			
				ReverseLinkedList newE=new ReverseLinkedList();
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
	
		
	public ReverseLinkedList reverse(ReverseLinkedList head)
	{
		ReverseLinkedList next=new ReverseLinkedList();
		ReverseLinkedList prev=null;
		ReverseLinkedList current=head;
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
	
	public void print(ReverseLinkedList head)
	{ 		ReverseLinkedList current=head;
			while(current!=null)
			{
				System.out.print(current.ch);
				current=current.next;
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch[]=sc.nextLine().toCharArray();
		ReverseLinkedList head=null;
		ReverseLinkedList obj=new ReverseLinkedList();
		
		for(int i=0;i<ch.length;i++)
		{
		

			head=obj.insert(head, ch[i]);
		}
		
		head=obj.reverse(head);
		obj.print(head);
		
		
	}

}