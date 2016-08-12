import java.util.*;
//17 - Given a binary tree print it in level order zigzag form
class BinaryTree
{
	int data;
	BinaryTree left;
	BinaryTree right;

}
public class BinaryZigZg {
	
			BinaryTree root;
			
			BinaryZigZg()
			{
				root=null;	
						
			}
			
			public void insert(int data)
			{
				root=insert(root,data);
			}
			public BinaryTree insert(BinaryTree node,int data)
			{
				if(node==null)
				{
					node=new BinaryTree();
					node.data=data;
				}
				else
				{
					 if(node.left==null)
					{
						 node.left=insert(node.left,data);
					}
					 else
					 {
						 node.right=insert(node.right,data);
					 }
				}
				return node;
				
			}
	
			public void printZigZag()
			{
				BinaryTree node=root;
				BinaryTree temp;
				
				Stack<BinaryTree> odd=new Stack<BinaryTree>();
				Stack<BinaryTree> even=new Stack<BinaryTree>();
				
				odd.push(node);
				while(!odd.isEmpty()||!even.isEmpty())
				{
					int leftLen=odd.size();
					int rightLen=even.size();
					
				///for the odd row print from right to left	
					for(int i=0;i<leftLen;i++)
					{
						temp=odd.pop();
						//here we put left node first to the stack, so that right node comes first
						if(temp.left!=null)
						{
						even.push(temp.left);
						}
						if(temp.right!=null)
						{	
						even.push(temp.right);
						}
						System.out.print(temp.data+",");
					}
					
					
					///for the even row print from left to right	
					for(int i=0;i<rightLen;i++)
					{   
						temp=even.pop();
						//here we put right node first to the stack, so that left node comes first
						if(temp.right!=null)
						{
						odd.push(temp.right);
						}
						if(temp.left!=null)
						{	
						odd.push(temp.left);
						}
						System.out.print(temp.data+",");
					}
					
					
					
				}
				
				
			}
			public void levelOrder()
			{
				levelOrder(root);
			}
			public void levelOrder(BinaryTree root)
			{
				BinaryTree temp;
				Queue<BinaryTree> q=new LinkedList<BinaryTree>();
				q.add(root);
				while(!q.isEmpty())
				{
					temp=q.remove();
					System.out.print(temp.data+":");
					if(temp.left!=null)
					{	//prints the left of the node temp
						System.out.print(":left"+temp.left.data);
					q.add(temp.left);
					}
					if(temp.right!=null)
					{	//prints the right of the node temp
						System.out.print(":right"+temp.right.data);

					q.add(temp.right);
					}
					System.out.println();

					
				}
				
				
				
			}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={5,1,6,8,9,3,0,2,10,7,2};
		
		BinaryZigZg obj=new BinaryZigZg();
		
		for(int i=0;i<a.length;i++)
		{	
			obj.insert(a[i]);
		}
		System.out.println("The level order traversal is ");
		obj.levelOrder();
		
		System.out.println("\nThe ZigZag traversal is ");

		obj.printZigZag();
		
		
		
			
		
	}

}
