
public class DFunction {

	public static void main(String[] args) {
		
		func();
		System.out.println(func1());
		System.out.println(func2());
		System.out.println(func3(4,5));
	}

	public static void func(){
	
		System.out.println("First function");
	
}
	
	public static int func1() {
		int a,b,sum;
		a=5;
		b=5;
		sum= a+b;
				
				
		return sum; }
	
	public static int func3(int a, int b) {
		
		int sum = a+b;
		return sum;
	}


	
	public static String func2() {
		String name = "yavuz";
		return name;

}}

