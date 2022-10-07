//javac -encoding UTF-8 Test5.java
import java.util.Scanner;
public class Test9{
   public static void main(String [] args){
	    int grade;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.printf("Enter first integer:");
        grade = input.nextInt();
        while(grade>100) {
         System.out.printf("Enter again:");
		 grade = input.nextInt();
        }
        switch(grade/10){
			case 9:
			case 10:
					System.out.println("A");
					break;
			case 8 :
					System.out.println("B");
					break;
			case 7:
					System.out.println("C");
					break;
			case 6 :
					System.out.println("D");
					break; 
			default :
					System.out.println("E");
		}
    }
}