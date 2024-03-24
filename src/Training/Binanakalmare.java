package Training;

public class Binanakalmare {

	public static void main(String[] args) {
		int number = 37;
		boolean flag = true;

		for (int i = 2; i * i < number; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("number is  prime " + number);
		} else {
			System.out.println("number is not prime " + number);
		}

	}
}
