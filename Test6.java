//javac -encoding UTF-8 Test5.java
import java.util.Scanner;
public class Test5{
   public static void main(String [] args){
	    int grade;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.printf("Enter first integer:");
        grade = input.nextInt();
        
        if (grade >=60 & grade <=70){
            System.out.println("<=70");
        }   
        else{
            System.out.println("<60");
        }  
   }
}