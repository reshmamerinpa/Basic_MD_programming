package basicmodule_java11;

import java.util.Scanner;

public class Auction {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int max=0;
		System.out.println("Enter the number of applications:");
		int size=s.nextInt();
		int[] bid=new int[size];
		System.out.println("Enter the amount:");
		for(int i=0;i<size;i++)
		{
			bid[i]=s.nextInt();
		}
			max=0;
			for(int i=0;i<size;i++)
			{
			if(max<bid[i])
		{
			max=bid[i];
		}
			}
		System.out.println("The winning bud is" +max );
	}

}
