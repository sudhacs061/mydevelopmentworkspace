package com.genetech.methods;


class maths2{

	void factorial() {
		int num =5;
		int fact =1;

		for(int i=fact ; i<=num; i++) {
			fact = fact*i;				
		}
		System.out.println(fact);
	}

	void factorial1(int f) {
		int fact1 = 1;
		for(int i=1 ; i<=f; i++) {
			fact1 = fact1*i;		
		}
		System.out.println("fact2 " + fact1);
	}
}

public class methodwithparameters {

	public static void main(String[] args) {

		maths2 a = new maths2();
		a.factorial();
		a.factorial1(5);
	}

}

//Assignments on methods 
//write a method display complete table eg 5 th table  6 ..ect 
//write a method to display given number prime number or not 
//write a program to display prime numbers 1 to 50
//method to display count of prime numbers in between 50 to 100
//write method it has to dispaly sum of  prime number in bet 1 to 100
//method disply no of digits in given number .
//write a method to method has to perform substarction of 2 matrixs display some of all elements .
//write a method for the given 2 ch array it has to display the ele in reverse order.
//write a method it has to sort the given 1 d unsorted int array.


//
////package com.genetech.methods;
////
////
////
////class maths2{
////	int fact =1;
////	
////	void addition() {
////		
////		for(int i=1 ; i<=5; i++) {
////		
////	System.out.println("addition " + fact);
////	}
////	
////	void multiplication(int a , int b) {
////		int res =(a*b);
////		System.out.println("mul " + res);
////	}
////}
////
////
////public class methodwithparameters {
////
////	public static void main(String[] args) {
////maths2 a = new maths2();
////a.addition(10, 30);
////a.addition(50, 60);
////a.multiplication(20, 30);
////	}
////
////}
