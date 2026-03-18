package com.kiit.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kiit.model.Engine;
import com.kiit.model.Gear;

public class DriverApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/mybeans.xml");
		System.out.println(beanFactory.isActive());
		
		Engine engine1=(Engine)beanFactory.getBean("e1");
		System.out.println(engine1);
		
		Engine engine2=(Engine)beanFactory.getBean("e2");
		System.out.println(engine2);
		
		Gear gear1=beanFactory.getBean("g1", Gear.class);
		System.out.println(gear1);
		
		Gear gear2=beanFactory.getBean("g2", Gear.class);
		System.out.println(gear2);

	}

}
