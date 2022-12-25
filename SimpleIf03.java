// Simple if Using Static Method

public class SimpleIf03 {
	
	public static void simple_if() {
		
		int t = 18;
		
		if (t>=18) {
			System.out.print("You are eligible for vote" + '\n' ); // (+ '\n') Called a line break; will print a new line.
		}
		
  }
     @SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		SimpleIf03.simple_if(); // Calling method by class
		
		// Create an Object
		SimpleIf03 myObj = new SimpleIf03();
		myObj.simple_if(); // Calling method by object
		
	}

}