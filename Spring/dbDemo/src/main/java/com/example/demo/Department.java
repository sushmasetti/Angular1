package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	int deptId;
	String name;
	String manager;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", name=" + name + ", manager=" + manager + "]";
	}
	

}
