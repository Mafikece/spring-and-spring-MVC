package com.azam.spm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("spring-config.xml");

		/*
		 * Demo demo1 = container.getBean(Demo.class); Demo demo2 =
		 * container.getBean(Demo.class); System.out.println(demo1);
		 * System.out.println(demo2);
		 * 
		 * A a = container.getBean(A.class); a.m1();
		 */

		Car car = container.getBean(Car.class);
		car.ride();
	}
}
