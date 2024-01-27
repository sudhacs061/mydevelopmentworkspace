package com.gentech.inheritanc;

class test22{
	void addition() {
		System.out.println("addition " + ( 111+20));
	}
	
}
class test32 extends test22{
	void multiplication() {
		System.out.println("Multification " +  (10*20));
	}
}
class test33 extends test32{

	void substarction() {
		System.out.println("substarction " +  (10-20));
	}
}


public class multilevelInheritance {
	public static void main(String[] args) {
		test33 ts = new test33();
		ts.multiplication();
	
	
	}

}
