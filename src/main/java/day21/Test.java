package day21;

import java.util.Random;

public class Test {

	public static void main(String[] args) {

		//int a = 123;
		//int b =23;
		int c = 34;
	

		
		//approch1
	   /*if(a>b &&a>c) {
		   System.out.println (a+ " is Largest Number" );
	   } else if(b>a && b>c) {
		   System.out.println(b+ " is Largest Number");
	   }else {
			System.out.println( c+ " is Largest Number");
	   }*/
		
		
		//ternary Operator
		//int largest1= a>b? a:b;  //largest of a and b
	   
		//int largest2 = c>largest1? c:largest1;  //
		
		//System.out.println(largest2 + "is Largest of number");
		
		
		//Random Number and string
		
		//Appraoch1 random
		
		Random rand = new Random();
		
		int rand_int = rand.nextInt(1000);
		System.out.println(rand_int);
		
		double rand_db1 = rand.nextDouble();
		System.out.println(rand_db1);
		
		//Appraoch 2
		
		System.out.println(Math.random());
		
		//
		
	      int [] num = {1,2,3,4,5,6}; 
	      int sum = 0;
	      for(int i=0; i<num.length; i++){
	          sum = sum + num[i];
	      }
	    System.out.println("Total sum of the number "+ sum);
	    
	  
	        /*int [] num1 = {2,4,6,7,7,8};
	      
	          for(int i=0; i<num.length; i++){
	           if(num1[i]%2==0){
	               System.out.println(num1[i]);
		
	           }*/
	           
	           int [] a = {2,4,6,7,7,8};
	           int [] b = {3,4,2,5,67,3};
	            
	            boolean status = false;
	            
	          if(a.length == b.length){  
	         for(int i=0; i<a.length; i++){
	             if(a[i]!=b[i]){
	                status = true; 
	             }
	         }
	         
	       }else {
	                  status = false;
	          }
	          
	           if(status == true){
	             System.out.println("Arrays not are equal");
	         }else{
	                 System.out.println("Arrays not are equal");
	         


	}

	}
}
