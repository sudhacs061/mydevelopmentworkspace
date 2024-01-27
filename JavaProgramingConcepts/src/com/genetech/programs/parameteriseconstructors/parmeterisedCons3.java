package com.genetech.programs.parameteriseconstructors;

class emp{
	String ename ;
	int age ;
	String location;

	public emp(String ename1,int age1 ,String location1) {
		ename = ename1;
		age = age1;
		location = location1;
		System.out.println(ename);
		System.out.println(age );
		System.out.println(location);
	}
}

class dep{
	String depteamName ;
	int noofteamMembers;

	public dep(	String depteamName1,int noofteamMembers1) {
		depteamName= depteamName1;
		noofteamMembers= noofteamMembers1;
		System.out.println(depteamName );
		System.out.println(noofteamMembers);

	}
}


class insurance{
	String insuranceName ;
	int premiumPaid;

	public insurance(String insuranceName1, int premiumPaid1) {
		insuranceName = insuranceName1;
		premiumPaid = premiumPaid1;
		System.out.println(insuranceName );
		System.out.println(premiumPaid);


	}
}

class empsavings{
	int pfpaid ;
	int monthlysavings;

	public empsavings(int pfpaid1, int monthlysavings1) {
		pfpaid = pfpaid1;
		monthlysavings = monthlysavings1;
		System.out.println(pfpaid );
		System.out.println(monthlysavings);
	}
}



public class parmeterisedCons3 {

	public static void main(String[] args) {
           new emp("Sudha",30, "bangalore");

		dep ll = new dep("Poseidon", 30);

		insurance s = new insurance("mediAssist", 12);


		empsavings cl = new empsavings(100000, 20);


	}
}


