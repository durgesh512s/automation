package My.Practice;

public class Factorial {

	static void factorialNumber(int num) {
		int fact = 1;

		if (num == 0 || num == 1) {
			System.out.println("factorial of " + num + " is 1.");
		}

		if (num > 0) {

			for (int i = 2; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("factorial of " + num + " is " + fact);
		} else {
			System.out.println("no. should be non negative.");
		}
	}

	public static void main(String args[]) {

		factorialNumber(5);
	}
}