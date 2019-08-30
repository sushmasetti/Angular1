package com.sk;

public class Person {

	int a;
	int b;
	Calc c;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public Calc getC() {
		return c;
	}
	public void setC(Calc c) {
		this.c = c;
	}
	public Person(int a, int b, Calc c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void addNumbers()
	{
		c.add(a,b);
	}

}
