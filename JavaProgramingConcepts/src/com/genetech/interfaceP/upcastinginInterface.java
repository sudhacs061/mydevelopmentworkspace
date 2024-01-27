package com.genetech.interfaceP;

// we can not create a object for interface we can create only reference
interface product111{
	void productname(String productname);
}

interface order11{
	void showorder(String ordername);
}

class  laptop11 implements product111, order11
{

	@Override
	public void showorder(String ordername) {
		System.out.println("order name " +  ordername);
	}

	@Override
	public void productname(String productname) {
		System.out.println("Product name " +  productname);

	}	
}

public class upcastinginInterface {

	public static void main(String[] args) {
		//product111 aa = new laptop11();
		  //  aa.showorder("order1");
		  //  aa.productname("dell");
		    /// we can create ref for each interface and also 
		    
		    order11 aa1 = new laptop11();
			  //  aa.showorder("order1");
			    aa1.showorder("ordernumber6587"); 
			    
			    
			    // below used when we dont want to create using subclass
			    //in multiple inheritance reference variable of one interface can be used to allocate 
			    //the memory of varibale based on the casting
				product111 obj = new laptop11();
				obj.productname("dell");
			    order11 obj2 = (order11) obj;
			    obj2.showorder("testjhj");			
	}

}
