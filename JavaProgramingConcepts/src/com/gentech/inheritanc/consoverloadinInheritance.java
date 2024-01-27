package com.gentech.inheritanc;

// not assignment

class testconoverload extends hierarchialInheritance{

	testconoverload(int x, int y){
		super.addition(x, y);
	}
	
	void addition (int x , int y) {
		int res = x+y;
		System.out.println(res);
	}
}

public class consoverloadinInheritance {

	public static void main(String[] args) {

		testconoverload aa = new testconoverload(10, 1000);
		aa.addition(10, 0);
	}

}
