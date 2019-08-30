package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Component("emp")
@Scope("prototype")
@PropertySource("myresources.properties")
public class Employee {
	@Value("${myname.user}")
	private String name;
	private int age;
	private float salary;
	private String designation;
	@Autowired
	@Qualifier("addr")
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		System.out.println("Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation + "]");
		System.out.println(address);
		return "";
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
