package com.gentech.accessspecifer2;

 class AA{	 
	 AA(){
		System.out.println("aa  is constructor "); 		 
	 }	
 }
	 class BB extends AA{
		 BB(){
				System.out.println("BB  is constructor "); 
		 }
	 }	 
	 class CC extends BB{
		 CC(){
				System.out.println("CC  is constructor "); 
		 }
	 }	 
	 public class subclasstoaccesspecifier{
		 public static void main(String[] args) {
			 CC a = new CC();
		 }
	 }

