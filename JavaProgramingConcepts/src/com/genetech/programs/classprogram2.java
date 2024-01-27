package com.genetech.programs;

//2. create a class for emp , dep insurance ,empsavings , based on the object exceute
class emp{
	String ename ;
	int age ;
	String location;
}

class dep{
	String depteamName ;
	int noofteamMembers;
}


class insurance{
	String insuranceName ;
	int premiumPaid;
}

class empsavings{
	int pfpaid ;
	int monthlysavings;
}


public class classprogram2 {


	public static void main(String[] args) {
		emp ss = new emp();
		ss.ename = "Sudha";
		ss.age = 30;
		ss.location = "bangalore";	
		System.out.println(ss.ename);
		System.out.println(ss.age );
		System.out.println(ss.location);

		dep ll = new dep();
		ll.depteamName = "Poseidon";
		ll.noofteamMembers = 30;
		System.out.println(ll.depteamName );
		System.out.println(ll.noofteamMembers);

		insurance s = new insurance();
		s.insuranceName = "mediAssist";
		s.premiumPaid = 12;
		System.out.println(s.insuranceName );
		System.out.println(s.premiumPaid);

		empsavings cl = new empsavings();
		cl.monthlysavings = 100000;
		cl.pfpaid =50000;
		System.out.println(cl.monthlysavings);
		System.out.println(cl.pfpaid );


	}

}
