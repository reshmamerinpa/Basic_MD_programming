package face;
import java.util.Scanner;
public class Main {
	
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofId;
 static int regId=0;
	public Main(String name,String address,	String contactNumber,String email,String proofType,	String proofId)
	{
	this.name=name;
	this.address=address;
	this.contactNumber=contactNumber;
	this.email=email;
	this.proofType=proofType;
	this.proofId=proofId;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String name;
			String address;
			String contactNumber;
			String email;
			String proofType;
			String proofId;
			
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
address=sc.nextLine();
contactNumber=sc.nextLine();
email=sc.nextLine();
proofType=sc.nextLine();
proofId=sc.nextLine();

   Main customer=new Main(name,address,contactNumber,email,proofType, proofId);
 //  Main customer1=new Main(name,address,contactNumber,email,proofType, proofId);
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
			
		}
		
		
}
