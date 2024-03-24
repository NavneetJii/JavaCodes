package Training;

public class fibonacci {

	public static void main(String[] args) {
		int firstTerm= 0;
		int secondTerm=1;
		for (int i=0;i<10;i++)
		{
			int NextTerm=firstTerm+secondTerm;
			firstTerm= secondTerm;
			secondTerm=NextTerm;				
			System.out.print(NextTerm);
		}
		
		
	}

}
