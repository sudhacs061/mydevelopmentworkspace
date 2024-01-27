package com.genetech.programs.twoDArray.Assignments;

public class ReadfromsecondrowArray {
	public static void main(String[] args) {

	int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
    //System.out.print(a.length);

			for(int i=1; i<=a.length-1; i++) {
				
			for(int j=0; j<a[0].length; j++) {
				
		     System.out.print(a[i][j] + " ");
				
				}
		    System.out.println();

			}

	}

}
