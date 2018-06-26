import java.util.Scanner;

public class ACalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter First Number");
		int num1 = scan.nextInt();
		System.out.println("Please Enter Second Number");
		int num2 = scan.nextInt();
		
		int result;
		
		System.out.println("please enter operation");
		Scanner optn = new Scanner(System.in);
		
		String operation = optn.nextLine();
		
		if(operation.equals("+")) {
			result = num1 + num2;
			System.out.println("Your answer is " + result);
		}else if (operation.equals("*")) {
			result = num1 * num2;
			System.out.println(result);
			
		}else if (operation.equals("/")) {
			result = num1 / num2;
			System.out.println(result);
		

	}else if (operation.equals("-") && num1 > num2) {
		result = num1 - num2;
		System.out.println(result);

} else {
	System.out.println("Please check operation or check the amount of num1 and num 2 for subtraction operation");
}}}
