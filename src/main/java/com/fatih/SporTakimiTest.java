package com.fatih;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SporTakimiTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("app-config.xml");
		
		SporTakimi takim=context.getBean("fb" , SporTakimi.class);
		
		System.out.println(takim);
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
