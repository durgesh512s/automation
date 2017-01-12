package My.Practice;

public class OddEven

{
	static void number(int num) {

		if (num % 2 == 0) {
			System.out.println("The no is Even");
		} else {
			System.out.println("No is Odd");
		}
	}

	public static void main(String args[]) {
		number(23);
	}
}
