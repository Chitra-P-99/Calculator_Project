package com.jsp;

public interface Calculator {
	int add(int a,int b);//by default public and abstract
	int sub(int a,int b);
	int mul(int a,int b);
	float div(int a,int b);
	String displayErrorMessage();
}
