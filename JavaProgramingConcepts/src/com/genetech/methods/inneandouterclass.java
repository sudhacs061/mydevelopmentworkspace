package com.genetech.methods;
//based inner class object 
	
	
	class outer2{
		String firstname;
		inner2 in = new inner2();
		
		void showbranchname() {
			in.branchname = "computer";
			System.out.println("branchname "+  in.branchname );
		}
		void displayfirstname() {
			in.showfn();
			
		}
		private class inner2{
			private String branchname;
			void showfn() {
				firstname ="santhosh";
				System.out.println(firstname);
			}
		}
	}
	public class inneandouterclass {


	public static void main(String[] args) {

	}

}
