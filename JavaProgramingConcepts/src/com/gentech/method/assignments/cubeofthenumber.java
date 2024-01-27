package com.gentech.method.assignments;

class test{
   int[] cubeofthenumber(int a , int b) {
		int[] aa = new int[b];

	   for(int i=a; i<=b; i++) {

		   aa[i] = i*i*i;
		    System.out.println(aa[i]);
	   }
	   
	return aa;	   
   }

}
public class cubeofthenumber {

	public static void main(String[] args) {
		test a = new test();
		a.cubeofthenumber(1,10);
	}

}
