package com.lc.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lc1.LifeCycle;


public class Testlc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lc.xml");

	     LifeCycle obj = (LifeCycle) context.getBean("b");
	     obj.getMessage();
	     context.registerShutdownHook();

	}

}
