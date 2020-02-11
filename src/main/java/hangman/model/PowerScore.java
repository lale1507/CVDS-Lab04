package hangman.model;

public class PowerScore implements GameScore{

    private int puntaje;

    /**
    *@pre puntaje = 0
    *@pos punaje >= 0
    *@param correctCount
    *@param incorrectCount
    *@throws NullPointerException 
     */
    public int calculateScore(int correctCount, int incorrectCount){
        // Revisar el puntaje penalizado
        puntaje = 0;
        System.out.println("Valor del puntaje: "+ puntaje);
        puntaje -= (incorrectCount*8);//Penaliza por cada etra incorrecta
        //puntaje += (5^correctCount); // bonifica con 5^i
        for (int i=1; i<=correctCount; i++){
            puntaje += Math.pow(5,i);
        }

        if (puntaje<=0){
            puntaje=0;
        }
        if (puntaje>500){
            puntaje = 500;
        }
        return puntaje;
    }


}