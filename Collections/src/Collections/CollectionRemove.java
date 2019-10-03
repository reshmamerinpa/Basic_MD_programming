package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionRemove {
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter List Index["+i+"]");	
			String name=sc.next();
			list.add(name);
						
		}
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());	
		}
		
		
		System.out.println("Enter array2 size:");
		int n1=sc.nextInt();
		ArrayList<String> list1=new ArrayList<String>();
		for(int i=0;i<n1;i++)
		{
			System.out.println("Enter List Index["+i+"]");	
			String name=sc.next();
			list1.add(name);
						
		}
		Iterator itr2=list1.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());	
		}
		
		
		System.out.println("Merged array:");
		  list.addAll(list1);    //Merge both lists
		
	        System.out.println(list);
		
		}

}
