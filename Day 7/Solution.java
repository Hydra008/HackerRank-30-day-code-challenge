import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int length = arr.length;
        in.close();
        for(int j=length-1;j>=0;j--)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
