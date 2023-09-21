package week5.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Javachallenge6 {
	public static void main(String[] args) {
		
//		Given an array nums of size n, return the majority element.
//
//				The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//				Example 1:
//
//				Input: nums = [3,2,3]
//				Output: 3
//				Example 2:
//
//				Input: nums = [2,2,1,1,1,2,2]
//				Output: 2
//		
		
		
		 //Initialize array  
        int [] arr = new int [] {1, 2, 1, 1, 2, 2, 2, 1, 1};  
        //Array fr will store frequencies of element  
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
        //Displays the frequency of each element present in array  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] >arr.length/2)  
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }}  