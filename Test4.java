//javac -encoding UTF-8 Test4.java
import java.util.Scanner;
public class Test4{
   public static void main(String [] args){
	    int num1;
        int num2;
        int sum;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.printf("Enter first integer:");
        num1 = input.nextInt();
        
        System.out.printf("Enter second integer:");
        num2 = input.nextInt();
        
        
        sum  = num1+num2;
        System.out.println("The sum is " + sum);
   }
   public static void printStr(int str){
           System.out.println(str); 

   }
}