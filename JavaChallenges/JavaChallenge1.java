package JavaChallenges;

import java.util.ArrayList;
import java.util.List;

public class JavaChallenge1 {
	
//	Input: s = "Hello World"
//			Output: 5
//			Explanation: The last word is "World" with length 5.
//			Example 2:
//
//			Input: s = "   fly me   to   the moon  "
//			Output: 4
//			Explanation: The last word is "moon" with length 4.
//			Example 3:
//
//			Input: s = "luffy is still joyboy"
//			Output: 6
//			Explanation: The last word is "joyboy" with length 6.
	
	public static void main(String[] args) {
		String str1="Hello World";
		String[] str=str1.split(" ");
		
		String str2="   fly me   to   the moon  ";
		String str3=str2.replaceAll("   ", " ");
		String str4[]=str3.split(" ");
		
						
		String str5="luffy is still joyboy";
		String[] str__=str5.split(" ");
		
		JavaChallenge1 strlength=new JavaChallenge1();
		strlength.LengthOfLastWord(str);
		strlength.LengthOfLastWord(str4);
		strlength.LengthOfLastWord(str__);
			
		
	}

	public void LengthOfLastWord(String [] str)  {
		
		for (int i = str.length-1; i >0; i--) {
			
				String lastWord = str[i]. substring(str[i]. lastIndexOf(" ")+1);
				
				System.out.println("length of word "+ lastWord +"is " +lastWord.length());
				break;
		}
		
		
	}
	
}
