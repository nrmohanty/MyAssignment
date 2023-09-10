package week4.day1.homeassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		// Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//output 7
		
		//Create a empty Set Using TreeSet
	   Set<Integer> nos=new TreeSet<>(); 
	   
	   //Declare for loop iterator from 0 to data.length and add into Set 
	   for (Integer eachNos : data) {
			
		   nos.add(eachNos);
		}
		
	   // converted Set into List
				List<Integer> listno=new ArrayList<>(nos);
				
				//Print the second last element from List
				System.out.println("The second largest no is "+ listno.get(nos.size()-2));
				
				
				
			
		}
	}
	

