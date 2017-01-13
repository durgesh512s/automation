package My.Practice;

public class ArmstrongNumber {

	static void armstrong(int num) {
		int newNum = 0, reminder, temp;
		temp = num;
		while (temp != 0) {
			reminder = temp % 10;
			newNum = newNum + reminder * reminder * reminder;
			temp = temp / 10;
		}

		if (newNum == num) {
			System.out.println(num + " is armstrong.");
		} else {
			System.out.println(num + " is not armstrong.");
		}
	}

	public static void main(String args[]) {

		armstrong(407);
	}
}