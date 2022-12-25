// Merge : Non-Static No Args, Simple-If, If-Else-If-Ladder, For-Loop, while-Loop.
public class All_Merge01 {
	// Initialization
	int wh = 78;
	int gr = 67;
	int km = 53;
	int so = 49;
	// Create Methods
	public void multiple_1() {
		int nd = wh+km*so-gr;
		System.out.println("Value Of nd :" + nd);
		}
	public void multiple_2() {
		int nv = wh*km-so+gr;
		System.out.println("Value of nv :" + nv);
	}
	public void multiple_3() {
		int nc = km*gr+so-wh;
		System.out.println("Value of nc :" + nc);
	}

	public static void main(String[] args) {
		// Create an Objects 
		All_Merge01 mergeObj = new All_Merge01();
		mergeObj.multiple_1(); // Calling multiple_1 Method by Object
		mergeObj.multiple_2(); // Calling multiple_2 Method by Object
		mergeObj.multiple_3(); // Calling multiple_3 Method by Object
		
		// Simple If Statement 
       /*
		 * nd = 2608
		 * nv = 4152
		 * nc = 3522
	                          */ 
		{ System.out.println("Simple-If Statement :----------------------------------------:)"); }
	     // Use Bitwise (&) Operator => Both Value True
		if (4152 > 3522 & 2608 < 4152) {
			System.out.println("Value of nv is greater than nc & nd");
			
		}
		{ System.out.println("For-Loop Increment Statement :----------------------------------------:)"); }
        // For Loop Statement (Increment ++;)
		for (int so=49; so<=53; so++) {
			System.out.println("Value of so :" + so);
		}
		{ System.out.println("For-Loop Decrement Statement :----------------------------------------:)"); }
		// For Loop Statement (Decrement --;)
		for (int wh=78; wh>=67; wh--) {
			System.out.println("Value of wh :" + wh);
		}
		{ System.out.println("For-Loop Create Math Table 49 Statement :----------------------------------------:)"); }
		// For Loop Statement (Create Math Table of 49)
		int so = 49;
		int b = 1;
		for (; b<=10; b++) {
			System.out.println(so+ "*" +b+ "=" +so*b);
		}
   { System.out.println("If-Else-If Ladder Statement :----------------------------------------:)"); }
		// If-Else-If Ladder Statement 
        // Use Logical AND (&&) Operator 
		if (78<so && so>53) {
			System.out.println("so is Greater than wh & km ");
		}
		else if (78>=so && so==67) {
			System.out.println("wh is greater than equal to so & so is equal to gr ");
			}
		else if (67!=so && so>67) {
			System.out.println("gr is not equal to so & so is greater than gr");
		}
		else {
			System.out.println("Wh=78>gr=67>km=53>so=49");
		}
		{ System.out.println("While-Loop Increment Statement :----------------------------------------:)"); }
          // While-Loop Increment (++;)
		while (so<67) {
			System.out.println("Value of so :" + so);
			so++;
		}
		{ System.out.println("While-Loop Create Math Table 53 Statement :----------------------------------------:)"); }
		// While-Loop Create Math Table of 53
		int km = 53;
		int h = 1;
		while (h<=10) {
			System.out.println(km+ "*" +h+ "=" +km*h);
			h++;
		}
	}

}
