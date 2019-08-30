package com.sk.test1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sk.one.Employee;



public class TestDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("department.xml"));
		 Employee bean =(Employee) factory.getBean("bean4");
		bean.printName();

	} 

}
