/**
 * 
 */
package com.interview;

import java.util.Arrays;

/**
 int[]  a= { 2,4,3,7,5}  
 
 int[] b= {9,8,1,10 };
 
output =  {1,2,3,4,5,7,8,9,10}
   
 not sorted , 
 
 union of two arrays , makesure it is sorted. 
 
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]  a= { 2,4,3,7,5} ; 
		 
		 int[] b= {9,8,1,10 };
		int[] union = new int[a.length +b.length];
		
		
		  int i=0; 
		  
		  for(int element : a) {
			  union[i] = element; 
			  i++; 
		  }
		  
		  for(int ele: b) {
			  union[i] = ele;
		  }
		  
		  int[] distinctArr = Arrays.stream(union).distinct().toArray(); 
		  
		  Arrays.sort(distinctArr);
		  
		
		
		   
		    

	}

}
