//javac -encoding UTF-8 Test5.java
import java.util.Scanner;
public class Test5{
   public static void main(String [] args){
	    int num1;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.printf("Enter first integer:");
        num1 = input.nextInt();
        
        if (num1 >=60){
            System.out.println("PASS!!");
        }   
        else{
            System.out.println("FAIL!!");
        }  
   }
   public static void printStr(int str){
           System.out.println(str); 

   }
}