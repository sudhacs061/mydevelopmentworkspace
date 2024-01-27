package com.gentech.inheritanc;

class test111{
	void addition() {
		System.out.println("addition " + ( 111+20));
	}
	
}
class test21 extends test111{
	void multiplication() {
		System.out.println("Multification " +  (10*20));
	}
}
class test31 extends test21{

	void substarction() {
		System.out.println("substarction " +  (10-20));
	}
}
class test34 extends test111{

	
	void addition() {
		System.out.println("addition1 " + (100+1));
	}
}


public class hybridinheritance {

	public static void main(String[] args) {
		test34 a = new test34();
		a.addition();
	}

}
