package com.genetech.abstarct;
abstract class test{
	void testdisplaytext() {
		System.out.println("this is method displaying text");
	}
	
	void testgivennumbers() {
		System.out.println("this is method displaying number "+10);
	}
}
 class test011 extends test{
	 test011(){
		 super.testdisplaytext();
		 super.testgivennumbers();
	 }
 }

public class abstarctCwith2insstancemethod {

	public static void main(String[] args) {
		test011 aa = new test011();
	}

}
