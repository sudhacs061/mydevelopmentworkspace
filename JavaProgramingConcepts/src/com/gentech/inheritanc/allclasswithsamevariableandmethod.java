package com.gentech.inheritanc;

class employee{
	String name;
	void show() {
		System.out.println("emp name " + name);
	}
}

class department extends employee{
	String name ;
	department(String ename, String dname) {
		super.name =ename;
		name =dname;
	}
	void display() {
		System.out.println("department " +  name);
	}
}



class insurance extends department {
	String name;
	insurance(String ename, String dename, String insurance){
		super(ename,dename);
		this.name=insurance;	
	}
	void view() {
		System.out.println("insurance " + name);
	}
}

public class allclasswithsamevariableandmethod {
	public static void main(String[] args) {
		insurance ii = new insurance("santhosh", "testing", "TATA");
		ii.view();
		ii.display();
		ii.show();
		
	}
	

}
