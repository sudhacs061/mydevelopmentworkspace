package com.genetech.interfaceP;

interface product11{
	void productname(String productname);
}

interface order01 extends product11{
	void showorder(String ordername);
}

class  laptop01 implements order01{

	@Override
	public void showorder(String ordername) {
		System.out.println("order name " +  ordername);
	}

	@Override
	public void productname(String productname) {
		System.out.println("Product name " +  productname);

	}	
}
 

public class interfaceextendsanotherinterface {

	public static void main(String[] args) {
		laptop01  qq = new laptop01();
		qq.showorder("order297098");
		qq.productname("dell");
	}

}
