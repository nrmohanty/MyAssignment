package week1.day2;

public class LearningIterationLoop {
	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		String c="Nihar";
		String d="Nihar2";
		//Arithmetic Operation
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b); //quotient
		System.out.println(a%b); //remainder
		System.out.println(c==d);
		System.out.println("**************************************");
		
		if(c.equals(d))
		{
			
			System.out.println(c);
		}
		else 
		{
			System.out.println(d);
		}
		//Comparison Operator
		System.out.println(a>b);//true
		System.out.println(a<b);//false
		System.out.println(a>=b);//true
		System.out.println(a<=b);//false
		System.out.println(a!=b);//true
		System.out.println(a==b);//false
		
		//Relational Operator
		System.out.println(a>b && a<b );//false
		System.out.println(a>b || a>b);//true
		
	}
	
	

}
