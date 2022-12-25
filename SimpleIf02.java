// Simple If Using Non-Static Type

public class SimpleIf02 {
	
	public void simpleIf() {
		int a = 18;
		
		if (a>=18) {
			System.out.println("You are allowed to drive vehicle with license");
		}
		
	}
	
	  public static void main(String[] args) {
    	  // Create an object
    	  SimpleIf02 myObj = new SimpleIf02();
    	  myObj.simpleIf(); // Calling method by using object
    	  
		}

}
