package case_study_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class case_1_hotel_room {
	public static int[] room=new int[26];
	public static int roomno=0;
	public static int[] arr=new int[50];
	static int p=1;

	public static void main(String args[])throws IOException
	{
	String n;
	int j,i=0;
	for( j=0;j<25;j++)
	{
	room[j]=0;
	}
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String name;
	    String address;
	    String contactNumber;
	    String email;
	    String proofType;
	    String proofID;
	    String n1,m,m1,a;
	
		do
	{
	System.out.println("Booking");

	String ac,cot,cable,wifi,laundry,date;
	System.out.println("AC/non-AC(AC/nAC)");
	ac=br.readLine();
	System.out.println("Cot (Single/Double)");
	cot=br.readLine();
	System.out.println("With cable connection/without cable connection (C/nC)");
	cable=br.readLine();
	System.out.println("Wi-Fi needed or not (W/nW)");
	wifi=br.readLine();
	System.out.println("Laundry service needed or not (L/nL)");
	laundry=br.readLine();
	

	book(ac,cot,cable,wifi,laundry);

	System.out.println("Do you want to proceed?(y/n)");
	m1=br.readLine();
	}
	while(m1.equalsIgnoreCase("y"));
	}
	
	public static void book(String ac,String cot,String cable,String wifi,String laundry)throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int tot=0;
	int j;
	//int roomno=0;
	if(ac.equalsIgnoreCase("ac"))
	tot=tot+500;
	else if(ac.equalsIgnoreCase("nAC"))
	  tot=tot+250;
	else
	ac=null;

	if(cot.equalsIgnoreCase("single"))
	tot=tot+200;
	else if(cot.equalsIgnoreCase("double"))
	tot=tot+450;
	else
	cot=null;

	if(cable.equalsIgnoreCase("C"))
	tot=tot+400;
	else if(cable.equalsIgnoreCase("nC"))
	tot=tot+350;
	else
	cable=null;

	if(wifi.equalsIgnoreCase("W"))
	tot=tot+400;
	else if(wifi.equalsIgnoreCase("nW"))
	tot=tot+350;
	else
	wifi=null;

	if(laundry.equalsIgnoreCase("L"))
	tot=tot+400;
	else if(laundry.equalsIgnoreCase("nL"))
	tot=tot+350;
	else
	laundry=null;

	System.out.println("The total charge is Rs."+tot);
	System.out.println("The services chosen are");
	System.out.println(cot+" cot "+ac+" room");
	if(cable.compareTo("c")==0)
	System.out.println("cable connection enabled");
	else
	System.out.println("cable connection disabled");

	if(wifi.compareTo("w")==0)
	System.out.println("wifi enabled");
	else
	System.out.println("wifi disabled");

	if(laundry.compareTo("l")==0)
	System.out.println("with laundry service");
	else
	System.out.println("without laundry service");

	//System.out.println("Do you want to proceed?(y/n)");
	// String n=br.readLine();
	int f=0;
	if(tot>0)// &&(n.equalsIgnoreCase("y")))
	{

	for( j=0;j<25;j++)
	{
	if(room[j]==0)
	{
	room[j]=1;
	roomno=j+1;
	f=1;
	//System.out.println(roomno);
	break;
	}
	}
	if(f==1)

	System.out.println("Thank you for booking. Your room number is "+roomno);
	}
	}

	
}
