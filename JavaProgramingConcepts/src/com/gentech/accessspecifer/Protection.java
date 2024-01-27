package com.gentech.accessspecifer;


public class Protection {

	private int private_a=100;
	int default_b=200;
	protected int protected_c=300;
	public int public_d=400;
	
	
	public Protection() {	
		System.out.println("private variable " + private_a);
		System.out.println("Default variable " + default_b);
		System.out.println("Protected variable " + protected_c);
		System.out.println("private variable " + public_d);		
	}
}
