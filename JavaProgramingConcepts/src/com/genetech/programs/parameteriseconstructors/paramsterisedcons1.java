package com.genetech.programs.parameteriseconstructors;


class student{
	String sname;
	int age1;
	String loc;
	student(String name,int age,String location){
		sname=name;
		age1=age;
		loc=location;
		System.out.println(sname);
		System.out.println(age1 );
		System.out.println(location);

	}
}
class library{
	String branch1 ;
	int lrowNos;

	library(String branch,int lrowNo){
		branch1=branch;
		lrowNos=lrowNo;
		System.out.println(lrowNos);
		System.out.println(branch1 );

	}
}

class sports{
	String sname1 ;
	int noofStudentin1;

	sports(String sname,int noofStudentin){
		sname1=sname;
		noofStudentin1=noofStudentin;
		System.out.println(sname1);
		System.out.println(noofStudentin1 );

	}
}

public class paramsterisedcons1 {


	public static void main(String[] args) {
		student ss = new student("rekha", 30,"mandya");


		library ll = new library("cs", 30);

		sports s = new sports("cricket", 11);



	}
}


