package com.au.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DAO {

	public static void main(String[] args) {
		ApplicationContext container =new ClassPathXmlApplicationContext("spring-config.xml");
		DemoBean bean = container.getBean(DemoBean.class);
		System.out.println(bean);
		bean.m();
	}

}
