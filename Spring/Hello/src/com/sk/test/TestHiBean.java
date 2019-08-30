package com.sk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sk.HelloConstr;

public class TestHiBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory factory =new XmlBeanFactory(new ClassPathResource("hello.xml"));
		HelloConstr bean2 =(HelloConstr) factory.getBean("bean2");
		bean2.sayHello();
		

	}

}
