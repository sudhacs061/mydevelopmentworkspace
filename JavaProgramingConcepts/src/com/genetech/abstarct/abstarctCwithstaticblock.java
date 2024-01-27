package com.genetech.abstarct;

abstract class test41{
	static {
		System.out.println("this is static block");
	}
}

class test11 extends test41{
	void addtion() {
		System.out.println("addition of 10 and 20 " +(10+20));
	}
}

public class abstarctCwithstaticblock {

	public static void main(String[] args) {
		test11 aa = new test11();
		//aa.addtion();
	}

}
