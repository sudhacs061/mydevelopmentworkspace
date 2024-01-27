package com.genetech.programs.parameteriseconstructors;

class maths{
	public maths(int x, int y, String action) {
		int res =0;
		switch (action) {
		case "add": {
			res =(x+y);
			System.out.println(res);
			break;
		}
		
		case "sub": {
			res =(x-y);
			System.out.println(res);

			break;
		}
		
		case "mul": {
			res =(x*y);
			System.out.println(res);

			break;
		}
		case "div": {
			res =(x/y);
			System.out.println(res);

			break;
		}
		
		default:
			System.out.println("invalid action");
		}
	}
}


public class constructorlimitation {
	//below eg : in order to exceute each action  , must create object , if we have n no of actions then we need keep on create n no of objects 

	
	public static void main(String[] args) {
		maths add = new maths(10, 20, "add");
		maths mul = new maths(10, 20, "mul");
		maths sub = new maths(100, 20, "sub");
		maths div = new maths(250, 50, "div");

		
	}
}
