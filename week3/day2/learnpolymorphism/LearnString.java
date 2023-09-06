package week3.day2.learnpolymorphism;

import java.util.Iterator;

public class LearnString {
	
	public static void main(String[] args) {
		//Literal declaration
		String name="TestLeaf";
		//Instantiation
		String str=new String("TestLeaf");
		//Difference is only the memory space
		//Compare == & .equalsTo
		//== check only for the references and it will not check 
		//.equals compare the contents 
		System.out.println(name==str);
		System.out.println(name.equals(str));
		System.out.println(str.equals(name));
		int len=name.length();
		System.out.println("Total length"+len);
		System.out.println(str.equalsIgnoreCase(name));
		System.out.println(name.contains("Test"));
		String convertString=name.toLowerCase();
		//convert lowercase
		System.out.println(convertString);
		
		//convert uppercase
		System.out.println(name.toUpperCase());
		
		//substring
		System.out.println(name.substring(5));
		System.out.println(name.substring(3, 6));//end index always will be minus 
		
		//to Char Array
		char[] ch=name.toCharArray();
		System.out.println(ch[2]);
		for (int i = 0; i < ch.length; i++) {
			
			System.out.println(ch[i]);
			
		}
		
	
	}
	
}