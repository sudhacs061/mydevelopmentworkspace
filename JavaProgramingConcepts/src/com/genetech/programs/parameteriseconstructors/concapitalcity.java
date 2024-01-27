package com.genetech.programs.parameteriseconstructors;



class capitalcity{
	public capitalcity(String cityname) {
		System.out.println(cityname);
	}

	public capitalcity(String country, int population) {
		System.out.println(country);
		System.out.println(population);
	}

}



public class concapitalcity {

	public static void main(String[] args) {
		capitalcity a = new capitalcity("Delhi");
		capitalcity aa =new capitalcity("India", 393590000);
}
}
