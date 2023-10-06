package JavaChallenges;

public class JavaChallenge10 {
	
//	You're given strings jewels representing the types of stones that are jewels,
//	 and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//
//	Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//	Example 1:
//
//	Input: jewels = "aA", stones = "aAAbbbb"
//	Output: 3
//	Example 2:
//
//	Input: jewels = "z", stones = "ZZ"
//	Output: 0

	public static void main(String[] args) {
		
		 String jewels = "aA";
		 String stones = "aAAbbbb";
		 
		String jewels_ = "z";
		String stones_ = "ZZ";
		    
		JavaChallenge10 checkCount=new JavaChallenge10();
		System.out.println(checkCount.numJewelsInStones(jewels, stones));
		System.out.println(checkCount.numJewelsInStones(jewels_, stones_));
		 
	     
	}
	
	public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for(int i=0; i<stones.length();i++){
            for(int j=0;j<jewels.length();j++){
                if(stones.charAt(i) == jewels.charAt(j))
                    count++;
            }
        }
        return count;
    }
	}
	


