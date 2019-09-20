package firstproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Digits {
	 public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a;
		     int n;
		     int b;
		     int t=0;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		n=a/10;
		b=a%10;
		switch(b)
		{
		case 0:
		case 1:
		case 2:
		case 6:t=t+3;
		break;
		case 4:
		case 5:
		case 9:t=t+4;
		break;
		case 3:
		case 7:
		case 8:t=t+5;
		}
		switch(n)
		{

		case 2:
		case 3:
		case 4: t=t+6;
		break;
		case 5:
		case 6:t=t+5;
		break;
		case 7:t=t+7;
		break;
		case 8:
		case 9:t=t+6;
		}
		System.out.println(t);

		}
		}



