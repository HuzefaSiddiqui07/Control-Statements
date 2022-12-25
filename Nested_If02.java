// Nested_If Statement

public class Nested_If02 {
	
	// Create Method
	public  int subtract(int p, int t) {
		int subtract = p-t;
		return subtract;
	}
	
   public static void main(String[] args) {
		
	   // Initialization
		int number1 = 70;
		int number2 = 50;
		
		// Create an object
		Nested_If02 minus = new Nested_If02();
		int store = minus.subtract(number1, number2);
		
		System.out.println("Subtraction Of Two Numbers:------------------------------------------------------------");
		System.out.println("Subract is :" + store);
		
		// Apply While_Loop
		int subtract = 20;
		{System.out.println("While-Loop statements:-------------------------------------------------------------");}
		   while(subtract>=1) {
			System.out.println("Value of subtract :" + subtract);
			subtract--;
		}
		   
            // Nested_If Statement 
		int subtract1 = number1-number2;
		{System.out.println("Nested-If Statement:---------------------------------------------------------------");}
		if (subtract1>number2) {
			System.out.println("subtract1 is less than number2");
			if (subtract1==number1) {
				System.out.println("subtract1 is equal to number1");
				}
		}
		else {
			System.out.println("subtract1 is less than number1 & number 2");
			}
		
		// If_Else_If Ladder Statement
		int store1 = number1+number2;
		{System.out.println("If-Else-If Ladder Statement:------------------------------------------------------");}
		if(number2>store1) {
			System.out.println("number2 is greater than store1");
			}
		else if (number1==number2) {
			System.out.println("number1 is equal to number2");
		}
		else {
			System.out.println("store1 is greater than number1 & number2");}
    }
}
