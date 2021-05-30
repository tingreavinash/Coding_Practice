package com.avinash;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setEid(101);
		e1.setEname("Avinash");
		
		System.out.println("E1: "+e1);

		//Resource resource = new ClassPathResource("employeebean.xml");
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
		//Employee e2 = (Employee)factory.getBean("emp1");
		//Employee e3 = factory.getBean("emp2", Employee.class);
		
		Employee e2 = (Employee)context.getBean("emp1");
		
		System.out.println("E2: "+e2);
		
		ClassPathXmlApplicationContext ctx = (ClassPathXmlApplicationContext) context;
		ctx.close();
		
	}

}
