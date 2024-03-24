package Training;

public class finalfibonacci {
	// 0 1 1 2 3 5 8

	public static void main(String[] args) {
		int firstTerm = 0;
		int secondTerm = 1;
		System.out.print(firstTerm+ " "+ secondTerm);
		for (int i = 0; i < 10; i++) {
			
			int nextTerm = firstTerm + secondTerm;// 0 + 1 =1 , 1+ 1=2
			firstTerm = secondTerm;// 1 //1
			secondTerm = nextTerm;// 1//2
			System.out.print(" "+nextTerm);

		}
	}

}