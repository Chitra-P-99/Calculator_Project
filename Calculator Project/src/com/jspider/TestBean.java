package com.jspider;
class Bean
{
	private int age;
	private String name;
	public void setAge(int age)
	{
		this.age=age;//current object
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}

public class TestBean {

	public static void main(String[] args) {
		Bean b=new Bean();
		b.setAge(25);//initializing the age
		b.setName("Tom"); //initializing name value
		System.out.println("Name :"+b.getName());
		System.out.println("Age  :"+b.getAge());



	}

}
