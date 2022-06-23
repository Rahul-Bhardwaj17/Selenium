package introduction;

public class CompareTwoNo {

	public static void main(String[] args) {
		int i = 25;
		int j = 39;
		/*
		 * 25 != 39 
		 * 25 < 39 
		 * 25 <= 39
		 */
		if (i != j) {
			System.out.println(i + " != " + j);
		}
		if (i < j) {
			System.out.println(i + " < " + j);
		}
		if (i <= j) {

			System.out.println(i + " <= " + j);
		}
	}

}
