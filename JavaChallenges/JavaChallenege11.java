package JavaChallenges;

public class JavaChallenege11 {
//	Given a string s consisting of lowercase English letters, return the first letter to appear twice.
//
//			Note:
//
//			A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
//			s will contain at least one letter that appears twice.
//
//			Example 1:
//
//			Input: s = "abccbaacz"
//			Output: "c"
//			Explanation:
//			The letter 'a' appears on the indexes 0, 5 and 6.
//			The letter 'b' appears on the indexes 1 and 4.
//			The letter 'c' appears on the indexes 2, 3 and 7.
//			The letter 'z' appears on the index 8.
//			The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
//			Example 2:
//
//			Input: s = "abcdd"
//			Output: "d"
//			Explanation:
//			The only letter that appears twice is 'd' so we return 'd'.
	public static void main(String[] args) {
		
		 String str = "abccbaacz";
		 String str_ = "abcdd";
		
		    
		JavaChallenege11 checkRepeatingChar=new JavaChallenege11();
		System.out.println(checkRepeatingChar.firstRepeating(str));
		System.out.println(checkRepeatingChar.firstRepeating(str_));
		 
	     
	}
	
	public static char firstRepeating(String str) {
	    int n = str.length();
	    char ans = ' ';
	    int index = Integer.MAX_VALUE;
	    for (int i = 0; i < n; i++) {
	      char temp = str.charAt(i);
	 
	      // Checking that character in temp repeats or not by running a for loop
	      for (int j = i + 1; j < n; j++) 
	      {
	        if (str.charAt(j) == temp)
	        {
	 
	          // if the index where it repeated is less than the index of the previously
	          // repeated character then store this character in ans variable
	          // and its index where it repeated in index variable
	          if (j < index) {
	            index = j;
	            ans = str.charAt(j);
	          }
	        }
	      }
	    }
	    return ans;
	   

}
}