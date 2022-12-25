// Nested type use in switch case

public class Nested_SwitchCase{
	
  public static void main(String args[]){
	    int course = 2;
        int Syllabus = 4;
        
 switch(course){
case 1:
	System.out.println("Java Development Course");
      break;
default :
    System.out.println("Invalid");
      break;
case 2: 
      switch(Syllabus) {
      case 1:
             System.out.println("Core Java");
             break;
      case 2:
            System.out.println("Java 1.8 Features");
            break;
      case 3:
          System.out.println("Advanced Java");
          break;
      case 4:
          System.out.println("Real Time Tools");
          break;
            
      default :
    	    System.out.println("Invalid");
            break;
            }
          }
        }
      }