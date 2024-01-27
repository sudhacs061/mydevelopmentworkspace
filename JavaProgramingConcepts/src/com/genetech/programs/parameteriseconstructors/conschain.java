package com.genetech.programs.parameteriseconstructors;

public class conschain {
	
	
	public conschain(int a) {
		
		System.out.println(a);
	}
	
	public conschain(String s) {
		System.out.println(s);
		
	}

	public static void main(String[] args) {

		
		conschain a = new conschain(10);
		conschain s = new conschain("sudha");
	}
//usage of this operator at consu level
}
