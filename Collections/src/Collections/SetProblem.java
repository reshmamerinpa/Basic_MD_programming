package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SetProblem {
	
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int choice,i=1;
	ArrayList<String> list=new ArrayList<String>();
	do
	{
	System.out.println("1.Display installed applications"); 
		System.out.println("2.Install an application");
		System.out.println("3.Uninstall an application"); 
		System.out.println("4.Quit");
		
		choice=s.nextInt();
		Iterator itr=list.iterator();
	
	switch(choice)
	{
	case 1:
			if(list.isEmpty())
			{
				System.out.println("There is no application installed");
			}
			else
			{
				System.out.println("Installed Applications are:");
				while(itr.hasNext())
				{
					System.out.println(i+ ")"+itr.next());	
					i++;
				}
			}
			
			break;
		
	case 2:
		    System.out.println("Enter name:");
		    String name=s.next();
			list.add(name);
			System.out.println("Application Installed successfully");
			break;
	case 3:	
		i=1;
		System.out.println("Enter an application number:");
		int num=s.nextInt();
		//if(num>)
		//{
		//	System.out.println("Application not found:");
			
		//}
		//else
		//{
			list.remove(num-1);
		//}
		break;
	case 4:
		System.exit(0);
		
	}
	}while(choice!=4);
	
	}
	}

