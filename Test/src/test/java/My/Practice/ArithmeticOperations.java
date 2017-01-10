package My.Practice;

public class ArithmeticOperations {

	static void addition(int num1, int num2) {
		System.out.println("Addition is =");
		System.out.println(num1 + num2);

	}

	static void substraction(int num1, int num2) {
		System.out.println("Substraction is =");
		System.out.println(num1 - num2);

	}

	static void multiply(int num1, int num2) {
		System.out.println("Multiplication is =");
		System.out.println(num1 * num2);

	}

	static void division(int num1, int num2) {
		System.out.println("Division is =");
		System.out.println(num1 / num2);
	}

	static void modulus(int num1, int num2) {
		System.out.println("Modulas is =");
		System.out.println(num1 % num2);
	}

	public static void main(String args[]) {
		addition(20, 30);
		substraction(20, 30);
		multiply(20, 30);
		division(20, 30);
		modulus(20, 30);

	}

}
