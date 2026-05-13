package com.example.application.person.MainApplicationXMLBasedIOC;

//import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class MainApplicationXmlBasedIocApplication {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.application.person.MainApplicationXMLBasedIOC");
		//SpringApplication.run(MainApplicationXmlBasedIocApplication.class, args);
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Registration Page");
		System.out.println("Enter the name of the user ");
		String name = scanner.nextLine();
		System.out.println("Enter the age of the user ");
		int age = scanner.nextInt();
		System.out.println("Enter the contatct number of the user ");
	    long  contact = scanner.nextLong();
	    System.out.println("Enter the address of the user ");
	    scanner.nextLine();
	    String address = scanner.nextLine();
	    
	    User user = context.getBean(UserInfo.class);
	   
	  System.out.println(user.setInfo(name,age,contact,address));
	     	
	}

}
