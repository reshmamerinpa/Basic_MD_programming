package basicmodule_java12;

import java.util.Scanner;

public class Fouls {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int min=0,temp,i,j=0;
		System.out.println("Enter the number of players:");
		int size=s.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the number of fouls made by each player:");
		for(i=0;i<size;i++) {
			array[i]=s.nextInt();
						
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
