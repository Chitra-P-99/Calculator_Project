package com.jspider;
abstract class Person
{
	abstract void eat();
}
class Jerry extends Person
{
	@Override
	void eat()
	{
		System.out.println("eating");
	}
}

public class Solution {
	public static void main(String[] args) {
		Jerry j=new Jerry();
		j.eat();//2.Override all the abstract methods
	}
}
