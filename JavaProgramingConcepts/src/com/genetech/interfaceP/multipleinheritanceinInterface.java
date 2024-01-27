package com.genetech.interfaceP;
//multiple inheritance
interface product1{
	void productname(String productname);
}

interface order{
	void showorder(String ordername);
}

class  laptop1 implements product1, order{

	@Override
	public void showorder(String ordername) {
		System.out.println("order name " +  ordername);
	}

	@Override
	public void productname(String productname) {
		System.out.println("Product name " +  productname);

	}	
}

public class multipleinheritanceinInterface {

	public static void main(String[] args) {
      laptop1 aa = new laptop1();
      aa.showorder("order1");
      aa.productname("dell");
		
	}

}
