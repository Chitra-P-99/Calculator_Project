package com.jspider;

import java.util.Scanner;

public class CalcDemo {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);

		while(true)
		{
			System.out.println("enter choice");
			int c=ip.nextInt();
			switch(c)
			{
			case 1: System.out.println("hi");
			break;
			case 2: System.out.println("bye");
			break;
			case 3: System.out.println("Thank You");
			System.exit(0); 
			// it is always good practice to give 0 int value in exit parameter
			//exit() to terminate the jvm execution
			break;
			default : System.out.println("Invalid");
			}
		}

	}

}
