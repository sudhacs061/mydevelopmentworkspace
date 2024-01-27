package com.genetech.abstarct;
abstract class test31{
	
	 static void testdisplaytext1() {
		System.out.println("this is method displaying text");

	}
	 static	void testgivennumbers1() {
		System.out.println("this is method displaying number "+10);
	}
}

public class abstarctCwith2staticmethods {

	public static void main(String[] args) {
		test31.testdisplaytext1();
		test31.testgivennumbers1();
	}

}
