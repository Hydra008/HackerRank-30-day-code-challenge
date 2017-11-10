import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int maxValue = countNumberOfHourglass(arr);
        System.out.println(maxValue);
    }
    public static int countNumberOfHourglass (int[][] arr)
    {
        int max = 0;
        int numberOfHourglass=0;
        int counter =0;
        for(int i=0; i<4;i++)
        {
            for(int j=0; j<4;j++)
            {
                counter = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                    + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1]
                    + arr[i+2][j+2];
                numberOfHourglass++;
              
                if(counter>max)
                {
                    max=counter;
                }
            }
        }
        return max;
       
    }
}
