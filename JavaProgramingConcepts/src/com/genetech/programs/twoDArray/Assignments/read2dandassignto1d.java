package com.genetech.programs.twoDArray.Assignments;

public class read2dandassignto1d {
//need to chage the size of the array
	public static void main(String[] args) {
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
		int len = a.length*a[0].length;
		int sen[] = new int[len];
     int k =0;
		for(int i=0; i<=a.length-1;i++) {

			for(int j=0; j<a[0].length;j++) {
				sen[k]= a[i][j];
				k++;
			}
		}

		for(int jj=0; jj<sen.length;jj++) {
			System.out.println("single array " + sen[jj]);
		}



	}
}

