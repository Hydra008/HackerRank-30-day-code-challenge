public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 1; i<= testCase; i++)
        {
            String word = sc.next();
            String even = "";
            String odd = "";
            for (int k = 1 ; k<= word.length(); k++)
            {
                if(k%2==0)
                {
                    String temp = Character.toString(word.charAt(k-1));
                    even = even + temp;
                }
                else
                {
                    String temp1 = Character.toString(word.charAt(k-1));
                    odd = odd + temp1;                   
                }
            }
            System.out.println(odd+" "+even);
            
        }
        sc.close();
    }
}
