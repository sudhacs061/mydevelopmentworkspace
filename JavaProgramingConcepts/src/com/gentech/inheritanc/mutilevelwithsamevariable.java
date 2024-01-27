package com.gentech.inheritanc;

class c1{
	void test01(int aa, String a) {
		System.out.println("info from method test01 " + a + aa);
	}
}

class c2 extends c1{
	void test01(int aa, String a) {
		System.out.println("info from method test02 " + a + aa);
	}
}

class c3 extends c2{
	void test01(int aa, String a) {
		System.out.println("info from method test03 " + a + aa);
	}
}


public class mutilevelwithsamevariable {

	public static void main(String[] args) {
		c3 cc = new c3();
		
    cc.test01(10,"text");
    c2 c1 = new c2();
	
    c1.test01(10,"text");
	}

}
