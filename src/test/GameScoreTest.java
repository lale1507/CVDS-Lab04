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
    public void PowerBonusScoreTest(){
        PowerBonusScore puntaje = new PowerBonusScore();
        int valorCorrecto = puntaje.calculateScore(0,0);
        Assert.assertEquals(0, valorCorrecto);
    }

    /*
    *CONDICIONES DE FRONTERA PARA EL ORIGINALSCORE
    *correctCount < 0 (-1,0,1)
    *incorrectCount < 0 (-1,0,1)
    *los casos de 0 se encuentran como los valores iniciales
    */
    @Test
    public void  OriginalScoreTestLI1(){
        OriginalScore puntaje = new OriginalScore();
        int valorCorrecto = puntaje.calculateScore(-1,2);
        Assert.assertEquals(0, valorCorrecto);
    }

    @Test
    public void  OriginalScoreTestLI2(){
        OriginalScore puntaje = new OriginalScore();
        int valorCorrecto = puntaje.calculateScore(0,-1);
        Assert.assertEquals(0, valorCorrecto);
    }
    
    @Test
    public void  OriginalScoreTestLI3(){
        OriginalScore puntaje = new OriginalScore();
        int valorCorrecto = puntaje.calculateScore(1,0);
        Assert.assertEquals(100, valorCorrecto);
    }

    @Test
    public void  OriginalScoreTestLI4(){
        OriginalScore puntaje = new OriginalScore();
        int valorCorrecto = puntaje.calculateScore(0,1);
        Assert.assertEquals(90, valorCorrecto);
    }

    /*
    *CONDICIONES DE FRONTERA PARA EL BONUSSCORE
    *correctCount < 0 (-1,0,1)
    *incorrectCount < 0 (-1,0,1)
    *los casos de 0 se encuentran como los valores iniciales
    */
    @Test
    public void  BonusScoreTestLI1(){
         BonusScore puntaje = new  BonusScore();
        int valorCorrecto = puntaje.calculateScore(-1,2);
        Assert.assertEquals(0, valorCorrecto);
    }

    @Test
    public void  BonusScoreTestLI2(){
         BonusScore puntaje = new  BonusScore();
        int valorCorrecto = puntaje.calculateScore(0,-1);
        Assert.assertEquals(0, valorCorrecto);
    }

    @Test
    public void BonusScoreTestLI3(){
        BonusScore puntaje = new BonusScore();
        int valorCorrecto = puntaje.calculateScore(1,0);
        Assert.assertEquals(10, valorCorrecto);
    }

    @Test
    public void  BonusScoreTestLI4(){
        BonusScore puntaje = new BonusScore();
        int valorCorrecto = puntaje.calculateScore(1,1);
        Assert.assertEquals(5, valorCorrecto);
    }

    /*
    *CONDICIONES DE FRONTERA PARA EL POWERBONUSSCORE
    *correctCount < 0 (-1,0,1)
    *incorrectCount < 0 (-1,0,1)
    *correctCount > 500 (499,500,501)
    *los casos de 0 se encuentran como los valores iniciales
    */
    @Test
    public void  PowerBonusScoreTestLI1(){
        PowerBonusScore puntaje = new PowerBonusScore();
        int valorCorrecto = puntaje.calculateScore(-1,2);
        Assert.assertEquals(0, valorCorrecto);
    }

    @Test
    public void  PowerBonusScoreTestLI2(){
        PowerBonusScore puntaje = new PowerBonusScore();
        int valorCorrecto = puntaje.calculateScore(0,-1);
        Assert.assertEquals(0, valorCorrecto);
    }

    @Test
    public void PowerBonusScoreTestLI3(){
        PowerBonusScore puntaje = new PowerBonusScore();
        int valorCorrecto = puntaje.calculateScore(1,0);
        Assert.assertEquals(5, valorCorrecto);
    }

    @Test
    public void  PowerBonusScoreTestLI4(){
        PowerBonusScore puntaje = new PowerBonusScore();
        int valorCorrecto = puntaje.calculateScore(2,1);
        Assert.assertEquals(22, valorCorrecto);
    }

}