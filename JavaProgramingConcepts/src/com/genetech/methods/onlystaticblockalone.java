package com.genetech.methods;

class demo1{
	static {
		System.out.println("its a static block");
	}
}

public class onlystaticblockalone {

	public static void main(String[] args) {

		demo1 a = new demo1();
	}

}
