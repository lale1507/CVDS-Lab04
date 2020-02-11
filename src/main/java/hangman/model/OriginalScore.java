
package hangman.model;
public class OriginalScore implements GameScore{

    private int puntaje;

    /**
    *@pre  El juego inicia con puntos = 100
    *@pos  puntaje >= 0
    *@param correctCount letras correctas
    *@param incorrectCountletras incorrectas
    *@throws NullPointerException 
     */
    public int calculateScore(int correctCount, int incorrectCount){
        puntaje = 100;
        System.out.println("Valor del puntaje: "+ puntaje);
        puntaje += (correctCount*0); //No se bonifican las letras correctas
        puntaje -= (incorrectCount*10); // Se penaliza por cadaletra incorrecta
        if (puntaje<0){
            puntaje = 0;
        }
        
        return puntaje;
    }


}