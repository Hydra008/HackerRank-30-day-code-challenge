import java.io.*;
import java.util.*;

public class Solution {

       public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      	String binaryNumber;
        binaryNumber = convertBinary(n);
        int maxCountOfOne = checkOneCount(binaryNumber);
        System.out.println(maxCountOfOne);
    }
    public static String convertBinary(int n)
    {
        int[] binaryBits = new int[32];
        for (int i = 32; i > 0; i--)
        {
         binaryBits[i-1] = n%2;
         n=n/2;
        }
      return Arrays.toString(binaryBits);
    }
    public static int checkOneCount(String binary)
    {
        int max =0;
        int count =0;
        for(char c :binary.toCharArray())
        {
            String ch=""+c;
            if(ch.equals("1"))
            {
                count+=1;
                if(count>max)
                {
                    max=count;
                }
            }
            else if(ch.equals("0"))
            {
                count=0;
            }
        }
        return max;
    }
}
