package oprocess;

public class StatPattern {

	public static void main(String[] args) {
		
		/*
		 * Scanner myObj = new Scanner(System.in); // Create a Scanner object
		 * System.out.println("Enter Number of Lines you want to print"); int n =
		 * myObj.nextInt();
		 */
	int n = 5;
	//Right side triangle
	/*
	 * for (int i = 1; i <= n; i++) { for (int j = 1; j <= i; j++) {
	 * System.out.print("* "); } System.out.println(); }
	 */
	
	//upside down right side triangle
	/*
	 * for (int i = 1; i <= n; i++) { for (int j = n; j >= i; j--) {
	 * System.out.print("* "); } System.out.println(); }
	 */
	
	//Left Triangle Star Pattern
	
	for (int i = 1; i <= n; i++) {

		for (int j = n; j > i; j--) {
			System.out.print("  ");
		}

		for (int k = 0; k < i; k++) {

			System.out.print("* ");
		}

		System.out.println();
	}
		 
		 
	}

}
