package basicmodule_java9;

import java.util.Scanner;

public class Leapyear {
	
	public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = s.nextInt();
        boolean flag = false;
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        if(flag)
        {
            System.out.println("It is a Leap Year");
        }
        else
        {
            System.out.println("It is not a Leap Year");
        }
    }
}
