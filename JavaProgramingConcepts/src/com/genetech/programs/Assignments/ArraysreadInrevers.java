package com.genetech.programs.Assignments;

public class ArraysreadInrevers {

	public static void main(String[] args) {
	//	System.out.println("test");

        int size =0;
		for(int i=71; i>=51; i--) {
			if(i%2!=0) {
				size=size+1;
			}
		}
		System.out.println("size" + size);

		int x[]=new int[size];
		int k=0;
		for(int j=71; j>=51 ;j--) {
			if(j%2!=0) {
				x[k] =j;
				k=k+1;
			}
			
			}
		for(int z=x.length-1;z>=0;z--) {
			System.out.println(x[z]);
		}
		
		}
				
	}
