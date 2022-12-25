// If_Else Statement using Non-Static Method


public class If_Else03 {
	// Create Method 01
    public void if_Else1() {
    	int i = 25;
		int u = 15;
        int d = i+u;
        
        if (d<i) {
        	System.out.println("d is greater than i"); // True Statement Print 
        }
        else {
        	System.out.println("i is not greater than d"); // If False then Else Statement is Print
        	
       }
    }
            // Create Method 02
    public void if_Else2() {
    	int h = 45;
		int s = 35;
        int k = h-s;
        
        if (k>h) {
        	System.out.println("k is greater than h"); 
        } 
        else {
        	System.out.println("k is not greater than h"); // If False then Else Statement is Print
        	
       }
    }
	public static void main(String[] args) {
		
		// Create an Object
		If_Else03 obj = new If_Else03();
		obj.if_Else1();  // Calling Method 01 By Object
		obj.if_Else2(); // Calling Method 02 By Object
		
		// In Method 01 Condition If Statement Is True ...Print On Console
		// In Method 02 Condition Else Statement Is True ...Print On Console

			}

    }
