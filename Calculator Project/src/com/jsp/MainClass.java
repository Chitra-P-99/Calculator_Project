package com.jsp;
interface Paytm
{
	int id=10;// public static final int id=10; by default
	void payment(); // by default public abstract void payment(); 
}
class Amazon implements Paytm
{
	@Override
	public void payment()//equal or higher visibility access specifier
	{
		System.out.println("payment by Paytm");
	}
}


public class MainClass {

	public static void main(String[] args) {
		Amazon a1=new Amazon();
		a1.payment();
		System.out.println(Paytm.id);

	}
}
//interface is blueprint of class
//interface and class is Java Type Definition






