package com.genetech.methods;

class demo22{
	demo22(){
		System.out.println("non arge cons");
	}
	
	static
	{
		System.out.println("its static bloack ");
	}
}



public class staticblockandconstructor {

	public static void main(String[] args) {

		demo22 a = new demo22();
	}

}
