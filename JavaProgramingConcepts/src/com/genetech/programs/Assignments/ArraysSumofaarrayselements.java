package com.genetech.programs.Assignments;

public class ArraysSumofaarrayselements {

	public static void main(String[] args) {

		int size =0;
		for(int i=50; i<=100; i++) {
			if(i%3==0) {
				size=size+1;
			}
		}
		System.out.println("size" + size);

		int x[]=new int[size];
		int k=0;
		for(int j=50; j<=100 ;j++) {
			if(j%3==0) {
				
				x[k] =j;
				k=k+1;
			}
			
			}
		int sum = 0;

		for(int z=x.length-1;z>=0;z--) {
			 sum = sum + x[z];
		}
		System.out.println("sum "+ sum);

		}
		
	}

