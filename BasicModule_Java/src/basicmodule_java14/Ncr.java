package basicmodule_java14;

import java.util.Scanner;

public class Ncr {
	public static void main(String[] args)
	{
		int n,f=1,f2=1,f1=1,r,c=0,ncr;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n:");
	   n=s.nextInt();
	   System.out.println("Enter the value of r:");
	   r=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		//System.out.println("The number of Combination is:"+f);
		for(int i=1;i<=r;i++)
		{
			f1=f1*i;
		}
	
		//System.out.println("The number of Combination is:"+f1);
		c=n-r;
		for(int i=1;i<=c;i++)
		{
			f2=f2*i;
		}
		ncr=f/(f2*f1);
		System.out.println("The NCR factor for given value is:"+ncr);
		
	}

}
