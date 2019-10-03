package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class CloneMethod {
	 
		 public static void main(String[] args)
		 {
			Scanner sc=new Scanner(System.in); 
			System.out.println("Enter array size:");
			int n=sc.nextInt();
			LinkedList<String> list1=new LinkedList<String>();
			LinkedList<String> list2=new LinkedList<String>();
			for(int i=0;i<n;i++)
			{
				//System.out.println("Enter List Index["+i+"]");	
				String name=sc.next();
				list1.add(name);
							
			}
			//list.add(2,"welcome");
			//list.remove(4);
			
			Iterator itr1=list1.iterator();
			
			
			System.out.println("Actual Linked List:");
			while(itr1.hasNext())
			{
				System.out.println(itr1.next());	
			}
			System.out.println("Cloned Linked List:");
			list2=(LinkedList<String>) list1.clone();
			Iterator itr2=list2.iterator();
			while(itr2.hasNext())
			{
				System.out.println(itr2.next());	
			}

}
}
