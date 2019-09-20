package basicmodule_java5;

import java.util.Scanner;

public class Average {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int size=sc.nextInt();
		int[] mark = new int[size];
		int sum=0;
		int avg=0;
		System.out.println("Enter the mark of students");
		for(int i=0;i<size;i++)
		{
		mark[i]=sc.nextInt();
		}
		for (int i = 0; i < size; i++)
		    {
		       
		       sum=sum+mark[i];
		       
		    }
		avg=sum/size;
		System.out.println(" The average is:"+avg);

		}

		}
