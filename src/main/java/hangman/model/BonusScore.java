package hangman.model;
public class BonusScore implements GameScore{

    private int puntaje;

    /**
    *@pre puntaje = 0
    *@pos puntaje >= 0
    *@param correctCount
    *@param incorrectCount
    *@throws NullPointerException 
     */
    public int calculateScore(int correctCount, int incorrectCount){
        puntaje = 0;
        System.out.println("Valor del puntaje: "+ puntaje);
        puntaje += (correctCount*10); // bonifica las letras correctas
        puntaje -= (incorrectCount*5); // penaliza las letras correctas
        if (puntaje<0){
            puntaje = 0;
        }
        return puntaje;

    }


}