package com.gentech.method.assignments;

class sumof1darray{
	 int qa = 0;
	int arraym(int[] a){
		for(int i=0; i<a.length; i++) {
               qa = qa + a[i];
		}
		return qa;
	}
}

public class sumofintegerarray {

	public static void main(String[] args) {

		int[] a1 = {10,20,30,40,50};
		sumof1darray aa = new sumof1darray();
		System.out.println(aa.arraym(a1));
		
	}
		
		
}
