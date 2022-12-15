package basic;

public class CalculatorDemo1 {
	
	
	static void sum(int a, int b, int c) // method declaration 
	{
		int s; // local variable sum()
		s = a+b+c;
		System.out.println(s);
		
	}
	static void sub(int a, int b) // method declaration 
	{
		int s; // local variable sub()
		s = a-b; // 200-100 = 100
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		sum(25, 35,20);
		sum(20, 30,20);
		sub(20, 5);
		sub(100, 200);
		
		// write a call methos sum with par 100, 200;
		
	}

}
