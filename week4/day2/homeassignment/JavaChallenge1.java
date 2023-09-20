package week4.day2.homeassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaChallenge1 {
//	Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//	You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//	 
//
//	Example 1:
//
//	Input: nums = [2,2,1]
//	Output: 1
//	Example 2:
//
//	Input: nums = [4,1,2,1,2]
//	Output: 4
//	Example 3:
//
//	Input: nums = [1]
//	Output: 1

//	In the below code, the findNonDuplicates() method uses the Collectors.groupingBy() collector to group the 
	//elements in the list based on their identity (i.e., the element itself) and count their occurrences using Collectors.counting(). The result is a map (countMap) with each element as the key and its count as the value.
//
//	Then, using the stream again, we filter out the elements that have a count of 1
	//(i.e., non-duplicates) by accessing the count from the countMap and collect them into a new list using toList().
	
public static void main(String[] args) {
	
		       
    List<Integer> numbers = Arrays.asList(4, 1, 2, 1, 2);

    List<Integer> nonDuplicateNums = findNonDuplicates(numbers);

    System.out.println("Non Duplicate Numbers: " + nonDuplicateNums);

}

public static <T> List<T> findNonDuplicates(List<T> list) {

    Map<T, Long> countMap = list.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    return list.stream()
            .filter(element -> countMap.get(element) == 1)
            .toList();
}
}
  	
	
	
	
	

