import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
                /* Declare second integer, double, and String variables. */
        int j;
        double d1;
        String s1;

        /* Read and save an integer, double, and String to your variables.*/
         j = scan.nextInt();
         d1 = scan.nextDouble();
         String temp = scan.nextLine();
         s1 = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        int sum = i+j;
        double sum1 = d+d1;
        String result = s+s1;
        /* Print the sum of the double variables on a new line. */
		    System.out.println(sum);
        System.out.println(sum1);
        System.out.println(result);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        scan.close();
    }
}
