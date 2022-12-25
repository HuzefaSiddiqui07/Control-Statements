// If_Else_Ladder Type 
public class If_ElseLadder01 {
 // Create Method
 public void dMart() {
// Diwali Discounts on D-Mart Grocery Products
	int Discount = 82;
// This Discount Only For Dal Items 
 if (Discount>65 && Discount<75) {
 System.out.println("Available=> Masoor Dal, Mix Dal, Moong Dal");
 }
// This Discount Only For Chana Items 
 else if (Discount>50 && Discount<60) {
 System.out.println("Available=> Kabuli Chana, Chana Big, Chana Green");
 }
// This Discount Only For Vatana Items 
 else if (Discount>30 && Discount<40) {
 System.out.println("Available=> Vatana White, Vatana Green, Vatana Black");
 }
 else {
 System.out.println("Discount Not Available Below 30% & Above 75%");
 }
}

	public static void main(String[] args) {
		// Create Object
		If_ElseLadder01 obj = new If_ElseLadder01();
		obj.dMart(); // Method Calling By Object
 }
}
