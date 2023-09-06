package week3.day2.learnArrays;

import java.util.Arrays;

public class LearnArrays {
	
	public static void main(String[] args) {
		//type varaiable[]=values;
		int[] scores={98,97,76,87,90};
		int len=scores.length;
		System.out.println("The length of the array"+len);
		System.out.println("Socre value is"+scores[2]);
		//to sort the 
		Arrays.sort(scores);
		
		
		//maximum largest value
		System.out.println("the largest number is "+ scores[scores.length]);
	
				
	     for(int i = len-1;i>=0;i--){   	 
	    	 
		System.out.println(scores[i]);
		                                                		  
	     }
		                                                		  
		                                                		   			
		                                                		   		
		
	}}
