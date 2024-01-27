package com.genetech.interfaceP;
//all methods of interface are public 
interface product {

	void showproductname(String name);

}

class laptop implements product{

	@Override
	public void showproductname(String name) {
		System.out.println("product name " + name);		
	}

	void displayPrice(double price) {
		System.out.println("price of the product " + price);
	}

}

public class interfaceex1 {

	public static void main(String[] args) {

		laptop aa = new laptop();
		aa.displayPrice(2000.02);
		aa.showproductname("dell");
	}

}
