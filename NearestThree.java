//16 - You have an array containing information regarding n people.
//Each person is described using a string(their name)and a number(their position along a number line).
//Each person has three friends,which are the three people whose number is nearest their own.
//Describe an algorithm to identify each person's three friends.
import java.util.*;
public class NearestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		String name="";
		Object tname="",tname2="";
		int num=0;
		int min1=1000,min2=1000,min3=1000;
		String min1name="", min2name="", min3name="";
		
		System.out.println("enter the number of ppl");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the name of person");
			name=sc.next();
			System.out.println("enter the number line");
			num=sc.nextInt();
			
			tmap.put(num, name);
		}
		Collection c=tmap.values();
		
		//Iterator itrj;
		
		for(Map.Entry<Integer, String> itr:tmap.entrySet())
		{
			tname=itr.getValue();
			
		//	itrj=c.iterator();
					for(Map.Entry<Integer, String> itr2: tmap.entrySet())
					{	
						tname2=itr2.getValue();
						
								if(tname2!=tname)
								{
									
											if((itr2.getKey()-itr.getKey())<min1)
											{
												min2=min1;
												min2name=min1name;
												
												min3=min2;
												min3name=min2name;
												
												min1=(itr2.getKey()-itr.getKey());
												min1name=itr2.getValue();
									
												
											}
											else if((itr2.getKey()-itr.getKey())<min2)
											{

														min3=min2;
														min3name=min2name;
												
														min2=(itr2.getKey()-itr.getKey());
														min2name=itr2.getValue();
														
											}
											else if((itr2.getKey()-itr.getKey())<min3)
											{
														min3=(itr2.getKey()-itr.getKey());
														min3name=itr2.getValue();
														
											}
											
											
								}
					}
					
					
			System.out.println("the frnds of "+itr.getValue()+" are \n"+min1name+"\n"+min2name+"\n"+min3name);
			min1=min2=min3=1000;
			min1name=min2name=min3name="";
			
		}
		
		
		
		
		
	}

}
