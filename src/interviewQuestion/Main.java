package interviewQuestion;

public class Main {
	boolean bothEven(int num1, int num2) {
		boolean bothEven = true;
		if (num1 % 2 == 0 && num2 % 2 == 0) {
			bothEven = true;
		} else if (num1 % 2 == 0 || num2 % 2 == 0) {
			bothEven = false;
		}
		return bothEven;

	}

	double negate(double num) {
		double negate = num * -1;

		return negate;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		boolean both = obj.bothEven(-1, 6);
		System.out.println(both);
		double negate = obj.negate(-2);
		System.out.println(negate);
	}

}
