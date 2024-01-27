package com.gentech.method.assignments;


	
	class reversearray{
		
		int[] arraym(int[] a){
			int[] aa = new int[a.length];
			for(int i=a.length-1; i>=0; i--) {
				aa[i]= a[i];	
			}
			
			return aa;
			
		}
	}
	public class return1dayarray {
	
	public static void main(String[] args) {
		int[] a1 = {1,8,7,9,10};
		reversearray aa = new reversearray();
		aa.arraym(a1);
		for(int i=a1.length-1; i>=0; i--) {
			System.out.println(a1[i]);
		}
				
	}
}
