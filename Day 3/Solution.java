import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int count =0;
        int n = sc.nextInt();
        int d = sc.nextInt();
        List<Integer> sequence = new ArrayList();
        for(int a = 0;a<n;a++)
        {
            int temp = sc.nextInt();
            sequence.add(temp);
        }
        for(int c =0; c<n; c++)
        {
            int i = sequence.get(c);
            
            for(int e=0;e<n;e++)
            {
               int j = sequence.get(e);
                    if(j-i==d)
                    {
                    for(int f =0;f<n;f++)
                    {
                    int k = sequence.get(f);
                    if(k-j==d)
                         {
                             //System.out.println(i);
                             //System.out.println(j);
                             //System.out.println(k);
                             count++;
                         }
                    } 
               
                }
              
            }
                        
        }
        System.out.println(count);
    }
}
