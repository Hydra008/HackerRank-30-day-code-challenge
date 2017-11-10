class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    public Student(String firstName,String lastName, int id,int[] testScores){
        super(firstName,lastName,id);    
        this.testScores=testScores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate()
    {
        int scores=0;
        for(int i =0;i<testScores.length;i++)
        {
            scores+=testScores[i];
        }
        scores = scores/testScores.length;
        if(scores>=90 && scores<=100)
            return 'O';
        else if (scores>=80 && scores<=90)
            return 'E';
         else if (scores>=70 && scores<=80)
            return 'A';
        else if (scores>=55 && scores<=70)
            return 'P';
        else if (scores>=40 && scores<=55)
            return 'D';
        else
            return 'T';
        
        
    }
}
