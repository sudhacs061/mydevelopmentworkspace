package com.genetech.programs.parameteriseconstructors;

	class vehicle{
		public vehicle(String vname) {
			System.out.println(vname);
		}

		public vehicle(String color, int price) {
			System.out.println(color);
			System.out.println(price);
		}

	}
	public class conVehicle {

	public static void main(String[] args) {
		vehicle a = new vehicle("actival");
		vehicle aa =new vehicle("white", 393590);
		
	}

}
