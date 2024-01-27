package com.genetech.methods;


class test1{
	
	void add(int a , int b) {
		System.out.println(a+b);
	}
}

class test2{
	static void test22(int x , int y) {
		test1 a = new test1();
		a.add(10, 20);
		
		System.out.println(x*y);
	}
}

public class staticandinstancemethod {

	public static void main(String[] args) {
test2.test22(1, 3);
	}

}
