package com.gentech.inheritanc;

class t1 {
	void displaytext(String text) {
		System.out.println("text from t1 " + text);
	}
}

class t2 extends t1{
	t2(String text){
		super.displaytext(text);
		
	}
	void displaytext(String text) {
		System.out.println("text from t2 " + text);
	}
}

class t3 extends t2{


	t3(String text, String text2) {
		super(text);
		super.displaytext(text2);
	}

	void displaytext(String text) {
		System.out.println("text from t3 " +  text);
	}
}

public class multilevelwithsamemethods {
public static void main(String[] args)  {
	t3 tt = new t3("displaing text", "text2");
	tt.displaytext("text");
	
	
}
}
