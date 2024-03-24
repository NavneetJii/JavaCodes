package Training;

/* Online Java Compiler and Editor */
public class PrimeNumber {
//whether the given number is prime or not

	public static void main(String[] args) {

		// int x=2;
		int count = 0;
		for (int x = 0; x <= 100; x++) {

			boolean flag = false;
			if (x <= 1) {
				flag = true;
				System.out.println("number is not a prime number " + x);
			} else {
				for (int i = 2; i * i < x; i++) {
					if (x % i == 0) {
						flag = true;
						break;
					}
				}

				if (flag == false) {
					
					if (count == 0) {
						System.out.print(x);
						count++;
					} else {
						System.out.print(","+x);
					}
				}

			}
		}
		
	}
}
