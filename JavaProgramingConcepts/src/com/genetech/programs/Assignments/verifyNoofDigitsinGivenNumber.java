package com.genetech.programs.Assignments;

public class verifyNoofDigitsinGivenNumber {

	public static void main(String[] args) {

		int num =2000;
		if(num<10) {
			System.out.println(num +"is  1 digit number");
		}
		else if(num>10&&num<100){
			System.out.println(num +"is  2 digit number");
		}
		else if(num>100&& num<1000){
			System.out.println("it is  3 digit number");
		}else {
			System.out.println("it is 4 or more digit number");


		}
	}

}
