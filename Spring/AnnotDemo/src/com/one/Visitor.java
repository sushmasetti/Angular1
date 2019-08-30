package com.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Visitor {
	@Value("sushma")
	String name;

	@Autowired
	@Qualifier("euro")
	Exchange e;

	public void callMethod() {
		System.out.println(e.getExchangeRate(130));
	}
	

}
