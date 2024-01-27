package com.genetech.programs.twoDArray.Assignments;

public class Readfromsecondcolumn {

	public static void main(String[] args) {


		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
	    //System.out.print(a.length);

				for(int i=0; i<=a.length-1; i++) {
					
				for(int j=1; j<=2; j++) {
					
			     System.out.print(a[i][j] + " ");
					
					}
			    System.out.println();

				}

		}
		
		
	}
