package basicmodule_java7;

import java.util.Scanner;

public class Combination {
	public static void main(String[] args)
	{
		int num,f=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of alphabets in your name:");
	   num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			f=f*i;
		}
		System.out.println("The number of Combination is:"+f);
	}

}
