package com.genetech.programs.twoDArray.Assignments;

public class readCharfrmsentence {
	public static void main(String[] agrs) {
		
	char a[][] = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};
	String sen = "";
			for(int i=0; i<a.length; i++) {
				
			for(int j=0; j<a[0].length;j++) {
		  sen = sen+a[i][j];
		 	}
			}
			System.out.print(sen);


	}

}
