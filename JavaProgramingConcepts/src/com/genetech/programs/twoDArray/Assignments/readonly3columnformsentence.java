package com.genetech.programs.twoDArray.Assignments;

public class readonly3columnformsentence {

	public static void main(String[] args) {
		String a[][] = {{"test1","test2","test3"},{"test4","test5","test6"},{"test7","test8","test9"}};
	String sen = "";
		for(int i=0;i<a.length;i++) {
			int j=a.length-1;

			sen = sen + " " + a[i][j];

		}
		System.out.println(sen);

	}

}
