//javac -encoding UTF-8 Test5.java
import java.util.Scanner;
public class Test10{
   public static void main(String [] args){
	    int grade = 0;
		String space = "" ;
		while (grade < 10 ){
			    System.out.printf("%d %n ",grade);
				grade = grade + 1 ;
                System.out.printf(space);
				space = space + "   "  ;
		}
   }	
}