package com.genetech.programs;

//3. create a class for country , street , district , vialage based on the object exceute each members of the class 
class Country{
	String cname ;
	double population ;
	String capital;

}

class street{
	String sname ;
	String cross;
	int pincode;
}

class district{
	String dName ;
	String  city;
	int dpincode;
}

class village{
	String villagename ;
	String  district;
	int pincode;
}

public class classprogram3 {

	public static void main(String[] args) {
		Country cc = new Country();
		cc.capital = "Delhi";
		cc.cname = "India";
		cc.population = 1000000;	
		System.out.println(cc.capital);
		System.out.println(cc.cname );
		System.out.println(cc.population);

		street s1 = new street();
		s1.cross = "69th cross";
		s1.sname = "Rpa road";
		s1.pincode = 510010;

		System.out.println(s1.cross);
		System.out.println(s1.sname);
		System.out.println(s1.pincode);


		district dd = new district();
		dd.dName = "Cricket";
		dd.city = "bangalore";
		dd.dpincode = 560010;
		System.out.println(dd.dName);
		System.out.println(dd.city);
		System.out.println(dd.dpincode);


		village v1 = new village();
		v1.villagename= "Mandya";
		v1.district ="mandya";
		v1.pincode = 1873853;
		System.out.println(v1.villagename);
		System.out.println(v1.district );
		System.out.println(v1.pincode );



	}

}













