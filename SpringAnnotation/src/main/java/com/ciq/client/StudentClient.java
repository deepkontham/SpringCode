package com.ciq.client;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.Controllers;
import com.ciq.pojo.Address;
import com.ciq.pojo.Student;

public class StudentClient {

	public static Logger logger=LoggerFactory.getLogger(StudentClient.class);
	public static void main(String[] args) {
		
	Address address =new Address("rdm", "telangana", 5504.00);
    Student s=new Student(1, "pradeep", address);
    
    ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    Controllers s1=(Controllers) context.getBean("studcontroller");
    System.out.println(s);
    s1.save(s);
    logger.info("Application track{}",s);

} 
}
 