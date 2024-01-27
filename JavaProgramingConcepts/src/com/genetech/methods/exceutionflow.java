package com.genetech.methods;
//static block will exceute first
class student{
	
	static  String firstname;
	static int age ;

	static {
		firstname ="santhosh";
		showfn();
		showage();

	}

	static void showfn() {
		System.out.println("first name " + firstname);
	}
	static void showage() {
		System.out.println("age " + age);
	}

}

public class exceutionflow {
	public static void main(String[] args) {
		student.age =21;
		System.out.println(student.age);
	}

}
