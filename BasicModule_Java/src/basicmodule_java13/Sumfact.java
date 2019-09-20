package basicmodule_java13;

import java.util.Scanner;

public class Sumfact {
	public static void main(String[] args)
	{
		int num,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number :");
	   num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum is:"+sum);
	}

}
