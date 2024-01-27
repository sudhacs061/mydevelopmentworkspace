package com.genetech.methods;



class calbyref{
	
	void method1(int x,int y) {
		x+=100;
		y*=5;
		System.out.println("In method  x value " + x);
		System.out.println("In Method y value " + y);	
	}
}

public class callbyvalueexample {


	public static void main(String[] args) {
		calbyref re = new calbyref();
int x,y;
x=5; y=10;
System.out.println("before exceution x value " + x);
System.out.println("before exceution y value " + y);
callbyrefe ar = new callbyrefe();
re.method1(x, y);
System.out.println("After exceution x value " + x);
System.out.println("After exceution y value " + y);


	}

}
