package com.ciq.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.Greetingmsg;

public class Client {

	public static void main(String[] args) {

	BeanFactory factory=new ClassPathXmlApplicationContext("spring.xml");
	Greetingmsg msg=(Greetingmsg) factory.getBean("message");
	System.out.println(msg);
	}

}
