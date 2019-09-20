package basicmodule_java;

import java.util.Scanner;

public class Resume {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=s.nextLine();
		System.out.println("Enter Your Age:");
		int age=s.nextInt();
		s.nextLine();
		System.out.println("Enter Your Degree:");
		String degree=s.nextLine();
		System.out.println("Enter Your Branch:");
		String branch=s.nextLine();
		System.out.println("Enter Your Contact Number:");
		String contactNumber=s.nextLine();
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Degree:"+degree);
		System.out.println("Branch:"+branch);
		System.out.println("contact Number:"+contactNumber);
		
	}
	
}
