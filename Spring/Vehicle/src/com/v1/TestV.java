package com.v1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.v.test.Car;
import com.v.test.Sedan;

@SuppressWarnings("deprecation")
public class TestV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("vehi.xml"));
		Car car = (Car)factory.getBean("mycar");
		System.out.println(car);

		Sedan sedan = (Sedan)factory.getBean("touristcar");
		System.out.println(sedan.toString());
		
		Car car1 = (Car)factory.getBean("newcar");
		System.out.println(car1);
		
	}

}
