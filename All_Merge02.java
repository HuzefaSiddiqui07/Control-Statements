
public class All_Merge02 {
	// Create a Non-Static Method 01
	public int addition (int s , int k) {
		int add = s+k;
		return add;
	}
	// Create a Non-Static Method 02
	public int subtraction (int w , int f) {
		int subtract = w-f;
		return subtract;
		}
	// Create a Non-Static Method 03
	public int multiplication (int e , int r) {
		int multiply = e*r;
		return multiply;
	}
	

	public static void main(String[] args) {
		
		// Initialization
		int ab = 60;
		int ac = 40;
		int ae = 30;
		int re = 20;
		
		// Create an Object
		All_Merge02 myobj = new All_Merge02();
		int store1 = myobj.addition(ab, ac); // Method 01 call by object
		int store2 = myobj.subtraction(ab, ae); // Method 02 call by object
		int store3 = myobj.multiplication(re, ac); // Method 03 call by object
		
		// Print all value on console
		System.out.println("Addition Is =>" + store1);
		System.out.println("Subtraction Is :" + store2);
		System.out.println("Multiplication Is :" + store3);
		
		// Control Statements
		// If Else Statements
		
		if (ab<re && ae==ac) {
			System.out.println("re is greater than ab & ae is equal to ac");
		}
		else {
			System.out.println("ab is greater than re & ae is not equal to ac ");
		}
		
		// if else if ladder
		
		if (re>=ae & ac!=ab ) {
			System.out.println("re is greater than equal to ae & ac is not equal to ab");
		}
		else if (ac>=ab & ae==re) {
			System.out.println("ac is greater than equal to ab & ae is equal to re");
		}
		else {
			System.out.println("ab is greater ac, ae & re");
		}
		
		// Looping Statements
		// Create a math table of for loop 
		
		for (int s=1; s<=10; s++) {
			System.out.println(re+ "*" +s+ "=" +re*s);
		}
		// While loop
		int d = 1;
		while (d<=10) {
			System.out.println(ae+ "*" +d+ "=" +ae*d);
			d++;
		}
		// Do while loop
		int f=1;
		do {
			System.out.println(ac+ "*" +f+ "=" +ac*f);
			f++;
		} while (f<=10);
	 }
  }
