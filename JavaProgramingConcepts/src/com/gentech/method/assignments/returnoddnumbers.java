package com.gentech.method.assignments;


class oddnumber{
	
	int[] arraym(int[] a){
		int[] aa = new int[a.length];
		for(int i=a.length-1; i>=0; i--) {
			if(i%2!=0) {
			aa[i]= a[i];	
			//System.out.println(aa[i]);
		}
				
	}
		return aa;
}
}


public class returnoddnumbers {

	public static void main(String[] args) {
		oddnumber aa = new oddnumber();
		
		int[] a11 = {1,2,3,4,5,6,7,8,9,10};
		aa.arraym(a11);
		for(int i=0;i<a11.length; i++) {
			System.out.println(a11[i]);
		}
				
	}
		
	}