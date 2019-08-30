package com.sk.one;

public class Employee {
	String name;
	int id;
	Department d;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	public Employee(String name, int id, Department d) {
		super();
		this.name = name;
		this.id = id;
		this.d = d;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void printName()
	{
	d.printdeptName();

}
}