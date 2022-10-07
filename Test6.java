//javac -encoding UTF-8 Test5.java
import java.util.Scanner;
public class Test6{
   public static void main(String [] args){
	    int grade;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.printf("Enter first integer:");
        grade = input.nextInt();
        
        if (grade >=90 & grade <=100){
            System.out.println("A");
        }   
        else if (grade >=80 & grade <=89){
            System.out.println("B");
         
        }  
		else if (grade >=70 & grade <=79){
            System.out.println("C");
         
        } 
		else if (grade >=60 & grade <=69){
            System.out.println("D");
        
        } 
		else{
			System.out.println("E");
		}
   }
}