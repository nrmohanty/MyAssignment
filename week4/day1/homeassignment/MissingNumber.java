package week4.day1.homeassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
public static void main(String[] args) {
	int[] runno= {1,3,4,5,6,7,8,9,10};
	
	Set<Integer> unno=new TreeSet<>();
	
	
	for (Integer integer : runno) {
		unno.add(integer);
		
	}

	
	List<Integer> nextno=new ArrayList<>(unno);
	for (int i = 0; i < runno.length; i++) {
		
		if(nextno.get(i)!=i+1) {
			
			System.out.println("missing no is"+ (i+1));
			
			break;
		}
		
	}
		
	}
	
}

