package com.genetech.programs.parameteriseconstructors;



class insurancetype{
	public insurancetype(String name) {
		this("16 years", 20909);
		System.out.println(name);
	}

	public insurancetype(String noofyears, int premiumamount) {
		System.out.println(noofyears);
		System.out.println(premiumamount);
	}

}


public class consInsurance {

	public static void main(String[] args) {
		insurancetype ss = new insurancetype("lic");

	}

}
