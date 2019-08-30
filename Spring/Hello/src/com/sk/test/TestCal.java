package com.sk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


import com.sk.Person;

public class TestCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("hello.xml"));
		Person bean1 =(Person)factory.getBean("bean3");
		bean1.addNumbers();
	}

}
