package com.gentech.inheritanc;


class displayn{
	displayn(int a){
		System.out.println("display the number " +  a);
	}
	void addition() {
		System.out.println("addition " + (111+20));
	}
	
}
class sub1 extends displayn{
	sub1(int a) {
		super(a);
	}

	void multiplication() {
		System.out.println("Multification " +  (10*20));
	}
}
class sub3 extends  sub1{

	sub3(int a) {
		super(a);
	}

	void substarction() {
		System.out.println("substarction " +  (10-20));
	}
}


public class hybridconswithparameter {

	public static void main(String[] args) {
		sub3 sc3 = new sub3(10);
		sc3.addition();
	}

}
