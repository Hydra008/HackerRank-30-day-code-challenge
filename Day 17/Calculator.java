import java.util.*;
import java.io.*;
//Write your code here
class Calculator {
    Calculator(){
        
    }
    
    int power(int n,int p) throws Exception{
        if(n<0 ||p<0){
            throw new Exception("n and p should be non-negative");
        }
        else {
            int result=1;
            for(int i =0;i<p;i++){
                result = result*n;            
            }
            return result;
        }
    }
}
