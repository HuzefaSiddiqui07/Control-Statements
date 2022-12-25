 // Nested If Statement
// Age Comparison In Between Velocity's 2 Candidate 
public class Age_Comparison {
	//Create method
 public void age_compare() {
	int priyanka_age = 31;
	int huzefa_age = 23;
		
	if (priyanka_age<huzefa_age) {
		System.out.println("Huzefa is older than priyanka");
	 if (priyanka_age==huzefa_age) {
		 System.out.println("Both priyanka & huzefa are of the age same");
	   }
	}
	  else {
		System.out.println("In fact, priyanka is older than huzefa");
		}
	}
      public static void main(String[] args) {
		    // Create Method
		Age_Comparison bothAge = new Age_Comparison();
		        bothAge.age_compare();
        }
    }
