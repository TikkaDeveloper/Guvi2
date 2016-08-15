import java.util.*;

class tree
{
	int data;
	tree left;
	tree right;
	
}
public class LCAofBST {
	tree head=null;
	public void insertcall(int a)
	{
		head=insert(head,a);
	}

	public tree insert(tree node,int a)
	{
		tree current =node;
		if(current==null)
		{
			node =new tree();
			node.data=a;
			return node;
		}
		else if(a<current.data)
		{
			current.left= insert(current.left,a);
		}
		else if(a>current.data)
		{
			current.right=insert(current.right,a);
		}
		return current;
		
	}
	public void traversalcall()
	{
		traversal(head);
	}
	public void traversal(tree node)
	{
		Queue<tree> q=new LinkedList<tree>();
		q.add(node);
		tree temp=new tree();
		while(!q.isEmpty())
		{
			temp=q.remove();
			System.out.println(temp.data);
			
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				q.add(temp.right);
			}
		}
		
	}
	public tree findlcacall(int a1,int a2)
	{
		return lca(head,a1,a2);
	}
	public tree lca(tree head,int a1,int a2)
	{
		tree left,right;
		
		if(head==null)
		{
			return null;
			
		}
		else if(a1==head.data || a2==head.data)
		{
			return head;
		}
		else
		{
			left=lca(head.left,a1,a2);
			right=lca(head.right,a1,a2);
			
			if(left!=null && right!=null)
			{
				return head;
			}
			else 
			{
				return left!=null ? left :right;
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LCAofBST obj=new LCAofBST();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("The number of elements in the tree");
		int n=sc.nextInt();
		
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			obj.insertcall(sc.nextInt());
		}
		System.out.println("Enter the elements to whom lca are to be found ");
		
		int lca1=sc.nextInt();
		int lca2=sc.nextInt();
		
		obj.traversalcall();
		
		tree temp=obj.findlcacall(lca1,lca2);
		
		System.out.println("The LCA value of "+lca1 +"and "+lca2+" is"+ temp.data);
	}

}
