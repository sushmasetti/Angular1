package com.sk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sk.HelloWorld;

public class TestHelloBean {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("hello.xml"));
		HelloWorld h1 =(HelloWorld)factory.getBean("bean1");
		HelloWorld h2 =(HelloWorld)factory.getBean("bean1");
		//bean1.sayHello();
		System.out.println(h1==h2);
	}

}
