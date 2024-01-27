package com.genetech.abstarct;

abstract class test51{
	 {
		System.out.println("this is instance block");
	}
}

class test01 extends test51{
}


public class AbstarctCwithinstanceblock {

	public static void main(String[] args) {
		test01 aa = new test01();
	}

}
