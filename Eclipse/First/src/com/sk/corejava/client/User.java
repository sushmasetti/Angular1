package com.sk.corejava.client;

import java.util.ArrayList;

import com.sk.corejava.model.Employee;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees=new ArrayList<Employee>();
		Employee e1 = new Employee(1,"sushma", 30000);
		Employee e2 = new Employee(1,"hari", 50000);
		Employee e3 = new Employee(1,"jp", 20000);
		
employees.add(e1);
employees.add(e2);
employees.add(e3);

/*for(int i=0;i<employees.size();i++)
{
	employees.get(i).showIdNane();
}*/
for (Employee emp:employees)
	emp.showIdNane();

	}

}
