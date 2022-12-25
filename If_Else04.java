// If_Else Statement using Static Method

public class If_Else04 {
	// Create Method 01
	public static void if_else1() {
		int p = 12;
		int q = 12;
		int x = p*q;
		
		if(x==p) {
			System.out.println("x is equal to p" + '\n');
		}
		else {
			System.out.println("x is greater than p" + '\n');
		}
	}
	// Create Method 02
	public static void if_else2() {
		int w = 30;
		int z = 20;
		int b = w*z;
		if (b==w) {
			System.out.print("b is equal to w" + '\n');
			}
		else {
			System.out.print("b is greater than w" + '\n'); 
		}
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		//  Formula Type 01
		If_Else04.if_else1(); // Method 01 by class
		If_Else04.if_else2(); // Method 02 by class
		 // Formula Type 02
		// Create an Object
		If_Else04 obj = new If_Else04();
		obj.if_else1(); // Method 01 by object
		obj.if_else2(); // Method 02 by object
		
	}

}
