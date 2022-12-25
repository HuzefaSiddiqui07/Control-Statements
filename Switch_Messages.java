 // switch statement type

public class Switch_Messages {

	public static void main(String[] args) {
		
		int number = 2;    // 2 then it prints "Welcome to"
	      String Message;
	  
	        // switch statement to check Message
	      switch (number) {
	  
	        case 1:
	          Message = "Hello";
	          break;
	  
	        case 2:
	          Message = "Welcome to";
	          break;
	  
	        case 3:
	          Message = "Solutiongigs";
	          break;
	        
	        default:
	          Message = "Sorry please try another Number";
	          break;
	      }
	           System.out.println("Message: " + Message);
	  }
  }
