package com.gentech.accessspecifer;

public class subclassfromsamepackage extends Protection{	
		
		public subclassfromsamepackage()  {

			//System.out.println("private variable from subclass call" + private_a);
			System.out.println("Default variable from subclass call" + default_b);
			System.out.println("Protected variable from subclass call" + protected_c);
			System.out.println("private variable from subclass call" + public_d);		
		}

}
