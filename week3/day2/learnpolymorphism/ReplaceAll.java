package week3.day2.learnpolymorphism;

public class ReplaceAll {
	
	public static void main(String[] args) {
		
		String str="Chennai 600075";
		String replaceAll1=str.replaceAll("[^0-9]", "");
		System.out.println(replaceAll1);
		int parseInt=Integer.parseInt(replaceAll1);
		System.out.println(parseInt);
		
		String replaceAll2=str.replaceAll("[^a-zA-Z]", "");
		System.out.println(replaceAll2);
		
	}

}
