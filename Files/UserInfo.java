package com.example.application.person.MainApplicationXMLBasedIOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserInfo implements User {
	@Autowired
	@Qualifier("juniorEmployee")
	private Employee emp;
	private String name;
	private int age;
	private long contact;
	private String address;
//	// by constructor DI 
//	public UserInfo(Employee emp) {
//		this.emp = emp;
//	}
	
	@Override
   public String setInfo(String name, int age, long contact, String address) {
		      this.name  = name;
		      this.age = age;
		      this.contact = contact;
		      this.address = address;
		      
		       return emp.setDetails(name, age, contact, address);
   }
	

	
	
}
