package com.sk;

public class HelloConstr {
	String msg;

	public HelloConstr(String msg) {
		super();
		this.msg = msg;
	}

	public HelloConstr() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void sayHello()
	{
		System.out.println("message is" +msg);
	}

}