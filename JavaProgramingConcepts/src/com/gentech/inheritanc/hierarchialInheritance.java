package com.gentech.inheritanc;

//single class extended by all subclass
class test1{
	void addition(int x , int y) {
		System.out.println("addition " + (x+y));
	}
	
}
class test2 extends test1{
	void multiplication() {
		System.out.println("Multification " +  (10*20));
	}
}
class test3 extends test1{
	
	void substarction() {
		System.out.println("substarction " +  (10-20));
	}
}

class test4 extends test1{
	void modulus() {
		System.out.println("mod " +  (10%2));
	}
}

public class hierarchialInheritance {

	void addition(int x, int y) {
		System.out.println("HI - addition " + ( x+y));
	}
	
	
	
	public static void main(String[] args) {
		test4 ts = new test4();
		ts.addition(10,20);

	}

}
