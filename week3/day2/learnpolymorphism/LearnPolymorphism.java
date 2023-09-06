package week3.day2.learnpolymorphism;

public class LearnPolymorphism {

	public void add() {
		
		int a=90;
		int b=60;
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c) {
		
		System.out.println(a+b+c);
		
	}
	
public void add(float a,float b,float c) {
		
		System.out.println(a+b+c);
		
	}
public void add(float a,float b,float c,float d) {
	
	System.out.println(a+b+c+d);
	
}

public static void main(String[] args) {
	LearnPolymorphism lp=new LearnPolymorphism();
	lp.add();
	lp.add(20, 30, 40);
	lp.add(10.20f, 10.30f, 10.50f);
	lp.add(10.30f, 10.34f, 10.56f, 10.57f);
	
}

	
	



}
