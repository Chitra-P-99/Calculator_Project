package com.jsp;
public class CalculatorImpl implements Calculator
{
	@Override
	public int add(int a,int b)
	{
		return a+b;
	}
	@Override
	public int sub(int a,int b)
	{
		return a-b;
	}
	@Override
	public int mul(int a,int b)
	{
		return a*b;
	}
	@Override
	public float div(int a,int b)
	{
		return a/b;
	}
	@Override
	public String displayErrorMessage()
	{
		return "Please enter 1 to 5";
	}

}
