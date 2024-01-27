package com.genetech.programs.parameteriseconstructors;



class animal{
	public animal(String animalname) {
		System.out.println(animalname);
	}

	public animal(String color, String lifespan) {
		System.out.println(color);
		System.out.println(lifespan);
	}

}
public class consanimal {

	public static void main(String[] args) {
		animal a = new animal("Dog");
		animal aa =new animal("Brown", "16 years");
	}

}
