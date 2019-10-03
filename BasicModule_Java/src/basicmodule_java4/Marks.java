package basicmodule_java4;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int temp;
		System.out.println("Enter the number of students:");
		int size=s.nextInt();
		int values[]=new int[size];
		System.out.println("Enter the mark of student:");
		for(int i=0;i<size;i++) {
			values[i]=s.nextInt();
						
		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(values[i]<values[j])
				{
					temp=values[i];
					values[i]=values[j];
					values[j]=temp;
					
				}
			}
		}
		System.out.println("The Priority of marks is:");
		for(int i=0;i<size;i++)
		{
			System.out.println(values[i]);
		}
	}

}
