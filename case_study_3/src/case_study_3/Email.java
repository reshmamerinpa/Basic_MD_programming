package case_study_3;

import java.util.Scanner;

public class Email {
	
	public static void main(String[] args)
	{
		int i=0;
		Scanner s=new Scanner(System.in);
		String n;
		String name;
		String email;
		String address;
		String contactNumber;
		String prooftype;
		String proofId;
		String up;
		do
		{
		System.out.println("Registration:");
		i++;
		System.out.println("Enter Your Name:");
		 name=s.nextLine();
		System.out.println("Enter Your Address:");
	    address=s.nextLine();
		System.out.println("Enter Your Contact Number:");
		 contactNumber=s.nextLine();
		System.out.println("Enter Your Email:");
		 email=s.nextLine();
		System.out.println("Enter Your ProofType:");
	  prooftype=s.nextLine();
		System.out.println("Enter Your ProofId:");
		 proofId=s.nextLine();
		System.out.println("Thank you for registering.Your id is:"+i+"..");
		System.out.println("Do you want to continue registration(y/n)?");
		n=s.nextLine();
		} while(n.equalsIgnoreCase("yes"));
		
		System.out.println("Do you want to update the email_id?(y/n)");
		up=s.nextLine();
		while(up.equalsIgnoreCase("yes"))
		{
			System.out.println("Update Email id:");
			System.out.println("Enter new Email_id:");
			email=s.nextLine();
			System.out.println("Email updated:");
			System.out.println("Your Details are as follows");
			System.out.println("Name:"+name);
			System.out.println("Address:"+address);
			System.out.println("Email_ID:"+email);
			System.out.println("Contact Number:"+contactNumber);
			System.out.println("Proof Type:"+ prooftype);
			System.out.println("Proof ID:"+ proofId);
			System.exit(0);
		}
		

}
}
