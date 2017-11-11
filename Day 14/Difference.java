mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    	// Add your code here

    Difference (int [] elements){
        this.elements = elements;
    }
    
    public void computeDifference(){
        maximumDifference = 0;
        for(int i =0; i <elements.length; i++)
        {
            for(int j=1 ; j<elements.length;j++)
            {
                int temp = elements[i]-elements[j];
                int absDifference = Math.abs(temp);
                if(maximumDifference < absDifference)
                {
                    maximumDifference = absDifference;
                }
            }
        }
    }
