package basicmodule_java6;

import java.util.Scanner;

public class Retest {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the number of students:");
		int size=s.nextInt();
		int[] mark=new int[size];
		System.out.println("Enter the marks of students:");
		for(int i=0;i<size;i++)
		{
			mark[i]=s.nextInt();
			if(mark[i]<=50)
		{
			count++;
		}
		}
		System.out.println("Number of students appearing for retest is:"+count);
	}

}
