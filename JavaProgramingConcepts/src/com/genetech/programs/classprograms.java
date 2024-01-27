package com.genetech.programs;

//1create a class for student ,library ,sports computerlab  based on object exceute each memebers of the class
class student{
	String name ;
	int age ;
	String location;

}

class library{
	String branch ;
	int lrowNo;
}


class sports{
	String sname ;
	int noofStudentin;
}

class computerLab{
	String systemName ;
	String nameAssigned;
}


public class classprograms {


	public static void main(String[] args) {
		student ss = new student();
		ss.name = "Krishna";
		ss.age = 30;
		ss.location = "bangalore";	
		System.out.println(ss.name);
		System.out.println(ss.age );
		System.out.println(ss.location);

		library ll = new library();
		ll.branch = "CS";
		ll.lrowNo = 30;
		System.out.println(ll.branch );
		System.out.println(ll.lrowNo);

		sports s = new sports();
		s.sname = "Cricket";
		s.noofStudentin = 12;
		System.out.println(s.sname );
		System.out.println(s.noofStudentin);

		computerLab cl = new computerLab();
		cl.systemName = "system1";
		cl.nameAssigned ="shilp";
		System.out.println(cl.systemName);
		System.out.println(cl.nameAssigned );


	}

}
