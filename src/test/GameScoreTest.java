package hangman;
import org.junit.Assert;
import org.junit.Test;

import hangman.model.*;

public class GameScoreTest{

    /*
    * Valores iniciales de todos los tipos de Score
    */
    @Test
    public void OriginalScoreTest(){
        OriginalScore puntaje = new OriginalScore();
        int valorCorrecto = puntaje.calculateScore(0,0);
        Assert.assertEquals(100, valorCorrecto);
    }

    @Test
    public void BonusScoreTest(){
        BonusScore puntaje = new BonusScore();
        int valorCorrecto = puntaje.calculateScore(0,0);
        Assert.assertEquals(0, valorCorrecto);
    }

    @Test
    public void PowerScoreTest(){
        PowerScore puntaje = new PowerScore();
        int valorCorrecto = puntaje.calculateScore(0,0);
        Assert.assertEquals(0, valorCorrecto);
    }

}