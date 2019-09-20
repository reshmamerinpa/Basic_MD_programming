package case_study_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Scanner;

public class Hotel {

	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	public static int[] booked=new int[25];
	protected static int i=1;

	public static void main(String[] args) throws IOException  {
	//int ch;
	char option;
	int roomId;
	for(int i=0;i<25;i++)
	{
	booked[i]=0;
	}

	do
	{

	System.out.println("\n1.Book");
	System.out.println("2.Check Status");
	System.out.println("3.Exit");
	System.out.println("Choose Your option");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	option=(char)br.read();
	switch(option)
	{
	case '1': booking();
	          break;
	case '2':
	         checkStatus(); break;
	case '3':System.exit(0);break;

	}
		}
	while(option!='3');
	}
	
	private static void booking() throws IOException {
	// TODO Auto-generated method stub
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	int tot=0;
	int flag=0;
	int roomno=0;
	System.out.println("\nBooking");
	System.out.println("Please choose the services required.");
	System.out.println("AC/non-AC(AC/nAC)");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	ac=br.readLine();
	System.out.println("Cot(Single/Double)");
	cot=br.readLine();
	System.out.println("With cable connection/without cable connection(C/nC)");
	cable=br.readLine();
	System.out.println("Wi-Fi needed or not(W/nW)");
	wifi=br.readLine();
	System.out.println("Laundry service needed or not(L/nL)");
	laundry=br.readLine();

	if(ac.equalsIgnoreCase("AC"))
	tot=tot+500;
	else if(ac.equalsIgnoreCase("nAC"))
	tot=tot+250;
	else
	ac="NULL";

	if(cot.equalsIgnoreCase("Single"))
	tot=tot+200;
	else if(cot.equalsIgnoreCase("Double"))
	tot=tot+450;
	else
	cot="NULL";

	if(cable.equalsIgnoreCase("C"))
	tot=tot+400;
	else if(cable.equalsIgnoreCase("nC"))
	tot=tot+350;
	else
	cable="NULL";

	if(wifi.equalsIgnoreCase("W"))
	tot=tot+400;
	else if(wifi.equalsIgnoreCase("nW"))
	tot=tot+350;
	else
	wifi="NULL";

	if(laundry.equalsIgnoreCase("L"))
	tot=tot+400;
	else if(laundry.equalsIgnoreCase("nL"))
	tot=tot+350;
	else
	laundry="NULL";

	System.out.println("The Total charge is "+tot);
	System.out.println("The services chosen are");
	//System.out.println(ac);
	//System.out.println(cot);
	//System.out.println(cable);
	//System.out.println(wifi);
	//System.out.println(laundry);
	  System.out.println(" "+cot+ " cot "+ac+" room");
	  System.out.println("Cable connection enabled");
	  System.out.println("Wi-Fi enabled "); 
	  System.out.println(" with laundry service");
	System.out.println("Do you want to proceed?(yes/no)");
	String proceed=br.readLine();
	if(tot>0 &&(proceed.equalsIgnoreCase("yes")))
	{
	for(int i=0;i<25;i++)
	{
	if(booked[i]==0)
	{
	booked[i]=tot;
	roomno=i+1;
	flag=1;
	break;
	//i++;
	}
	}
	if(flag==1)
	System.out.println("Thank you for booking. Your room number is "+roomno+ ".");

	//Thank you for booking. Your room number is 2.
	}
	}
	private static void checkStatus() throws IOException 
	{
	System.out.print("Enter your Room Id:");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int roomId=Integer.parseInt(br.readLine());
	for(int j=0;j<=25;j++)
	{
	if(booked[roomId-1]>0)
	{
	System.out.println("Room number "+roomId+" is booked.");
	break;
	}
	else
	{
	System.out.println("Room number "+roomId+" is not booked.");
	break;
	}
	}
	}

}


