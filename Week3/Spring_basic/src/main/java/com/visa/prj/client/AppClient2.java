package com.visa.prj.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.visa.prj.service.EmployeeService;
import com.visa.prj.service.SampleService;

public class AppClient2 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("App2.xml");
		String[] beans=ctx.getBeanDefinitionNames();
		for (String name : beans) {
			System.out.println(name);
		}
		
		EmployeeService service=ctx.getBean("employeeService",EmployeeService.class);
		service.doTask();
	}

}
