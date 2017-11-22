//Write your code here
class Calculator {
    Calculator(){
        
    }
    
    int power(int n,int p) throws Exception{
        if(n<0 ||p<0){
            throw new Exception("n and p should be non-negative");
        }
        else {
            int result =1;
            if(p==1){
                result = result*n;
            }
            else if(p==0){
                result = 1;
            }
            else{
                result = n*power(n,p-1);
            }
            return result;
        }
    }
}
