package basicmodule_java10;

import java.util.Scanner;

public class Cricket {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int min=0,temp,i,j=0;
		System.out.println("Enter the number of bowlers:");
		int size=s.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the runs conceded by the bowlers:");
		for(i=0;i<size;i++) {
			array[i]=s.nextInt();
						
		}
		int[] array1=new int[size];
		System.out.println("Enter the number balls for each bowlers:");
		for(i=0;i<size;i++) {
			array1[i]=s.nextInt();
						
		}
		
		min=array[0];
		for(i=0;i<size;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
				j=i+1;
			}
		}
		System.out.println("The eligible player is player no:" +j + "("+min+")Fouls");
	}
	

}
