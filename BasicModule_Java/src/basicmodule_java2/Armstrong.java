package basicmodule_java2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Armstrong {
	public static void main(String[] args) throws  IOException
	{
	int num;
	int c=0;
	int sum=0;
	int a;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a Number");
	num=Integer.parseInt(br.readLine());
	int num1=num;
	int temp=num;

	while(num>0)
	{

	num=num/10;
	c++;
	}

	while(num1>0)
	{
	a=num1%10;
	sum=sum+(int)Math.pow(a,c);
	num1=num1/10;
	}
	if(temp==sum)
	{
	System.out.println("Given Number is amstrong");
	}
	else
	{
	System.out.println("Given number is not amstrong");
	}
	//System.out.println(c);
	}

	

}


