package Collections;

import java.util.Iterator;
import java.util.Scanner;

import java.util.ArrayList;

public class CollectionArray {
	 public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			//System.out.println("Enter List Index["+i+"]");	
			String name=sc.next();
			list.add(name);
						
		}
		//list.add(2,"welcome");
		//list.remove(4);
		
		
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());	
		}
		}

}
