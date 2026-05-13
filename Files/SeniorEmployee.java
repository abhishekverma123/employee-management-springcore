package com.example.application.person.MainApplicationXMLBasedIOC;

import org.springframework.stereotype.Component;

//import org.springframework.stereotype.Component;

@Component("seniorEmployee")
public class SeniorEmployee implements Employee {
	private String name;
	private int age;
	private long contact;
	private String address;
	private String employee = "Senior Employee";
	
       
	@Override
	public String setDetails(String name, int age, long contact, String address) {
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.address = address;
		return this.getDetails();
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return"Hi, "+this.employee+" name is: "+this.name+"\n Your age is: "+this.age+" \n Your contact number: "+this.contact+" \n Your Address: "+this.address;
	}

}
