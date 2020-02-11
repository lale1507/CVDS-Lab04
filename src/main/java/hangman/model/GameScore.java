package hangman.model;
public interface GameScore{
    
    
    /**
    *@pre 
    *@pos 
    *@param correctCount
    *@param incorrectCount
    *@throws NullPointerException 
     */
    public int calculateScore(int correctCount, int incorrectCount);

    



}