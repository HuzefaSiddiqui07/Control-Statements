 // If_Else_Ladder Type 

public class If_ElseLadder02 {
	// Create a method 
	public static int addition(int c, int d) {
		int sum = c+d;
		return sum;
	}

	public static void main(String[] args) {
		int no1 = 30;
		int no2 = 20;
		
	        // Create an Object 
		If_ElseLadder02 obj = new If_ElseLadder02();
		@SuppressWarnings("static-access")
		int result = obj.addition(no1, no2);
		System.out.println("Sum is :" + result);
		// Apply If_Else_Ladder Statement
		if (result<no1 && no1!=result ) {
			System.out.println("Condition is false");
		}
		else if (result>no1 && no2==no1 ) {
			System.out.println("Condition is false");
		}
		else if (result==no2 && no1>no2) {
			System.out.println("Condition is false");
		}
		else {
			System.out.print("Value of result is greater than no1 & no2");
		}
	}
}
