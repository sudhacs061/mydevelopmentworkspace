package com.gentech.accessspecifer2;

import com.gentech.accessspecifer.Protection;

public class subclassindifferentclass extends Protection{	
		
		public subclassindifferentclass()  {

			//System.out.println("private variable from subclass call" + private_a);
		//	System.out.println("Default variable from subclass call" + default_b);
			System.out.println("Protected variable from subclass call" + protected_c);
			System.out.println("private variable from subclass call" + public_d);		
		}
	
}
