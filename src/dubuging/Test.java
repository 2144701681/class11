package dubuging;

public class Test {

	public static void main(String[] args) {
		// Find out the issue is called debuging
		
		
		int a = 10;
		int b = 20;
		a=15;
		
		System.out.println(a);
		System.out.println(a);
		a=a+b;
		System.out.println(a);
		a=sum(a,b);
		System.out.println(a);
		//Breakpoint:a point where you want your code to stop at

	}
	public static int sum(int a,int b) {
		System.out.println("hi");
		System.out.println("hello");
		return a+b;
	}

}
