package basicmodule_java10;

import java.util.Scanner;

public class Cricket {
	public static void main(String[] args)
	{int num,temp1=0;
	float temp2=0;

	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of bowler:");
	num=s.nextInt();
	float a[]=new float [num];
	System.out.println("Enter the runs considered by the bowlers:");
	for(int i=0;i<num;i++)
	{
	a[i]=s.nextInt();
	}

	int b[]=new int [(int)num];
	System.out.println("Enter the number of balls for each bowlers:");
	for(int i=0;i<num;i++)
	{
	b[i]=s.nextInt();
	}

	System.out.println("economy of the bowler is:");
	for(int i=0;i<num;i++)
	{
	temp1=b[i]/6;
	a[i]=a[i]/temp1;

	System.out.println(a[i]);

	}
	float sum=0;

	for(int i=0;i<num;i++)
	{
	sum=sum+a[i];
	}
	float avg=sum/num;
	System.out.println("The overall economy of the team is");
	System.out.println(avg);
	int c=0;
	for(int i=0;i<num;i++)
	{
	if(a[i]<6)
	{
	c++;
	}

	}
	System.out.println("The number of bowlers eligible are:"+c);

	}
	

}
