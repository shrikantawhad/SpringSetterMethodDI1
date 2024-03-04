package com.ncs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ncs.beans.Address;
import com.ncs.beans.Student;

public class Main {

	public static void main(String[] args) {
		
		String config_loc = "/com/ncs/resources/applicationContxt.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc);
		
		//Student std = (Student) context.getBean("stdId", Student.class); -> We can use this way also
		Student std = (Student) context.getBean("stdId");
		std.display();
	}
}
