package com.genetech.programs.Assignments;

public class ArraysRead100to1fromHalfoftheelement {

	public static void main(String[] args) {



				int size =0;
				for(int i=100; i>=1; i--) {
					if(i%6==0) {
						size=size+1;
					}
				}
				System.out.println("size" + size);

				int x[]=new int[size];
				int k=0;
				for(int j=100; j>=1 ;j--) {
					if(j%6==0) {
						
						x[k] =j;
						k=k+1;
					}
					
					}
               int zz = x.length/2;
               System.out.println(zz);
			//	for(int z=x.length-1;z>=0;z--) {

				for(int z=zz;z>0;z--) {
					System.out.println("elements " +  x[z]);

				}

				}

}
