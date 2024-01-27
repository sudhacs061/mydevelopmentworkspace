package com.genetech.programs.parameteriseconstructors;



class birds{
	public birds(String feathercolor) {
		this("sprrow", 2);
		System.out.println(feathercolor);
	}

	public birds(String name, int noofwings) {
		System.out.println(name);
		System.out.println(noofwings);
	}

}
public class conschaining1 {

	public static void main(String[] args) {
		birds ss = new birds("gray colors");

	}
// cons overloading Assignments
	// write a class for vehicle 
// write class for capital city 
	//write a class for animals
	//write a class for softwaretools 

	// cons chaining assignments
	//write a class for insurance
	/// write a class for Hospital
	// write a class for patient 
	
	//limitation of cons
	// we can not  use same sequence of data because of this
	//we can not do someoparation whiich involves same datattypes eg: addition , substraction,..etc

}
