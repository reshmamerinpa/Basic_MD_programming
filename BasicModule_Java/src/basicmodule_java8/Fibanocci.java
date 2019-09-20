package basicmodule_java8;

import java.util.Scanner;

public class Fibanocci {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n,n1=0,n2=0,n3=1;
		System.out.println("Enter a number:");
		n=s.nextInt();
		  for(int i = 1; i <= n+3; i++)
	        {
	            n1 = n2;
	            n2 = n3;
	            n3 = n1 + n2;
	            System.out.print(n1+" ");
	        }
		
	}

}
