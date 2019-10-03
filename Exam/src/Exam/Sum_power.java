package Exam;

import java.util.Scanner;

public class Sum_power {
 public static void main(String[] args) {
	 int r=0,r1=0,sum=1;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	while(n>0)
	{
	    r=n%10;
		r1=(n/10)%10;
		sum=(int) (sum+Math.pow(r1,r ));
	    n=n/10;
		}
	System.out.println(sum);
	}
}
