package Exam;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] arg)
	{
	Scanner s=new Scanner(System.in);
	String var;
	String rev = "\0";
	var=s.nextLine();
	int len=var.length();
	for(int i=len-1;i>=0;i--)
	{
		rev=rev + var.charAt(i);
		
	}
	System.out.println(rev);
	
	}
	

}
