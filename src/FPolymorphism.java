
public class FPolymorphism {

//	one interface used by multiple classes
	
public static void main(String[] args) {
	
	one on2= new one();
	on2.fun();
	
//	one on1 = new two();
//	on1.fun();
	}
}
class one{
	void fun() {
		
		System.out.println("It is fun");
	}
	
}
class two extends one{
	
	void fun() {
		System.out.println("It is not fun");
	}
}