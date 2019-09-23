package case_study_2_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import case_study_2_1.Customer;

public class Customer {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofId;
 static int regId=0;
 public Customer(String name,String address,	String contactNumber,String email,String proofType,	String proofId)
	{
	this.name=name;
	this.address=address;
	this.contactNumber=contactNumber;
	this.email=email;
	this.proofType=proofType;
	this.proofId=proofId;
	}
 public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofId;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Registration");
		System.out.println("Enter your name:");
		name=br.readLine();
		System.out.println("Enter your address:");
		address=br.readLine();
		System.out.println("Enter your contact Number:");
		contactNumber=br.readLine();
		System.out.println("Enter your email_id:");
		email=br.readLine();
		System.out.println("Enter your proof Type:");
		proofType=br.readLine();
		System.out.println("Enter your proof id:");
		proofId=br.readLine();
		regId++;
		
		 Customer customer=new Customer(name,address,contactNumber,email,proofType,proofId);
		 
		   customer.register(name,address,contactNumber,email,proofType,proofId);
 }
private void register(String name2, String address2, String contactNumber2, String email2, String proofType2,
		String proofId2) {
	System.out.println(this.name);
	System.out.println(this.address);
	System.out.println(this.contactNumber);
	System.out.println(this.email);
	System.out.println(this.proofType);
	System.out.println(this.proofId);
	System.out.println("Thank you for registering your id is:"+regId);
	
}
	

}
