package com.gentech.method.assignments;


	
class secondhalfA{
		
		int[] arrayn1(int[] a){
			int[] aa = new int[a.length];
			
			for(int i=a.length/2;i<aa.length; i++) {
				aa[i]= a[i];	
			}
			
			return aa;
			
		}
	}
public class returnsecondofthearray {

	public static void main(String[] args) {
		secondhalfA aa = new secondhalfA();
		int[] a1 = {1,8,7,9,10,90};
		aa.arrayn1(a1);
		for(int i=a1.length/2;i<a1.length; i++) {
		
		System.out.println(a1[i]);
		
		}
	}
}


