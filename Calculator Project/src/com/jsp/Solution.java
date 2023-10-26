package com.jsp;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		//Menu Driven Program
		Scanner ip=new Scanner(System.in);
		Calculator c=new CalculatorImpl();//Upcasting -->Abstraction
		int n1=0,n2=0;
		while(true)
		{

			System.out.println("Enter your choice \n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
			int n=ip.nextInt();
			if(n>=1 && n<=4) 
			{
				System.out.println("enter no 1");
				n1=ip.nextInt();
				System.out.println("enter no 2");
				n2=ip.nextInt();
			}
			switch(n)
			{
			case 1: System.out.println("Result :"+c.add(n1, n2));
			break;
			case 2: System.out.println("Result :"+c.sub(n1, n2));
			break;
			case 3: System.out.println("Result :"+c.mul(n1, n2));
			break;
			case 4: if(n2!=0) {
				System.out.println("Result :"+c.div(n1,n2));
			}
			else
				System.out.println("Number cannot divided by zero Result : 0");
			break;
			case 5: System.out.println("Thank You");
			System.exit(0);
			break;
			default: System.out.println(c.displayErrorMessage());

			}
			System.out.println("==*==*==*==*==*==*==*==");
		}
	}

}
