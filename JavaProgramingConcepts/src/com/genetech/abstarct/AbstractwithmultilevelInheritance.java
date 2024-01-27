package com.genetech.abstarct;

abstract class M1{
	
	abstract void addition(int x, int y);
	abstract void Sub(int x, int y);

	
}
 class M2 extends M1{

	@Override
	void addition(int x, int y) {
	System.out.println("addition " +  x + y);	
	}

	@Override
	void Sub(int x, int y) {
		System.out.println("Sub " +  x + y);		
	}
	 
 }
 
 class m3 extends M2{
	 void method3() {
		 System.out.println("subclass m3");
	 }
 }

public class AbstractwithmultilevelInheritance {

	public static void main(String[] args) {		
		m3 a = new m3();
		a.addition(10, 20);
		a.Sub(30, 10);
	}

}
