package com.genetech.programs.parameteriseconstructors;


class Country{
	String cname ;
	double population ;
	String capital;
	public Country(String cname11, double population1, String capital1) {
		cname = cname11;
		population = population1;
		capital =capital1;
		System.out.println(capital);
		System.out.println(cname );
		System.out.println(population);
	}
}

class street{

	String sname ;
	String cross;
	int pincode;
	public street(String sname1, String crossname, int pin) {
		cross = crossname;
		sname = sname1;
		pincode = pin;

		System.out.println(cross);
		System.out.println(sname);
		System.out.println(pincode);

	}
}

class district{
	String dName ;
	String  city;
	int dpincode;
	public district(String dName1 ,String  city1,int dpincode1) {
		dName = dName1;
		city =city1 ;
		dpincode = dpincode1;
		System.out.println(dName);
		System.out.println(city);
		System.out.println(dpincode);
	}
}

class village{
	String villagename ;
	String  district;
	int pincode;
	public village(String villagename1 ,String  district1,int pincode1) {
		villagename= villagename1;
		district =district1;
		pincode = pincode1;
		System.out.println(villagename);
		System.out.println(district );
		System.out.println(pincode );

	}
}

public class parameterisedcons2 {

	public static void main(String[] args) {{
		Country cc = new Country("Delhi",1000000,"India");
		street s1 = new street("69th cross","Rpa road", 510010);
		district dd = new district("Cricket","bangalore",560010);
		village v1 = new village("Mandya","mandya",1873853);




	}

	}

}
