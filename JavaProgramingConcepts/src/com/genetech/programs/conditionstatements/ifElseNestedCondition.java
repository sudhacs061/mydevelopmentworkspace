package com.genetech.programs.conditionstatements;

public class ifElseNestedCondition {

	public static void main(String[] args) {

		int marks =15;
		if(marks>=70) {
			System.out.println("the result is distinction");
		}
		else if((marks<70)&& (marks>=60)) {
			System.out.println("the result is firstclass");
		}
		else if((marks<60)&& (marks>=50)) {
			System.out.println("the result is second class");
		}
		else if((marks<50)&& (marks>=35)){
			System.out.println("just pass");
		}
		else {
			System.out.println("failed ");
		}
	}

}
