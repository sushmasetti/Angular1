package com.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.one.Visitor;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Conversion.xml");
Visitor vs=(Visitor)context.getBean("visitor");
vs.callMethod();

	}

}
