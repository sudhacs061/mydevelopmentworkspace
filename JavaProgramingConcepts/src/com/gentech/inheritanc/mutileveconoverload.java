package com.gentech.inheritanc;
class test10{
	test10(int a,int b){
	int res = a + b;
	System.out.println("addition " +res);
	}
	test10(String x, int y) {
        System.out.println("text and number "+ x +y);
	}	
}	
	class test11 extends test10{
		test11(int a, int b) {
			super(a, b);
		}
		test11(String a, int b) {
			super(a, b);
		}  
	}
	
	class test411 extends test11{
		test411(int a, int b) {
			super(a, b);
		}	
		test411(String a, int b) {
			super(a, b);
		}	
	}
public class mutileveconoverload {

	public static void main(String[] args) {	
		test411 a = new test411(10,20);
		test411 aa = new test411("text",20);
	}

}
