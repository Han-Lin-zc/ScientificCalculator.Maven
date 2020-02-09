package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.ScientificMethod;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScientificMethodTest {

    @Test
    public void testSwitchDisplayMode()
    {
        ScientificMethod scientificMethod1 = new ScientificMethod();
        scientificMethod1.switchDisplayMode(ScientificMethod.DisplayMode.BINARY);
        assertEquals(ScientificMethod.DisplayMode.BINARY, scientificMethod1.getDisplayMode());
    }


    @Test
    public void testGetSquare1()
    {
        ScientificMethod scientificMethod1 = new ScientificMethod();
        scientificMethod1.getSquare(2);
        assertEquals(4,2, scientificMethod1.getJ());
    }


    @Test
    public void testGetSquare2()
    {
        double value = 4;
        ScientificMethod scientificMethod1  = new ScientificMethod();
        scientificMethod1.getSquare(4);
        assertEquals(16, (value * value), scientificMethod1.getJ());
    }


    @Test
    public void testSqrt()
    {
        ScientificMethod scientificMethod1 = new ScientificMethod();
        scientificMethod1.sqrt(4);
        assertEquals(2, 2, scientificMethod1.getK());
    }


    @Test
    public void testGetSin()
    {
        double actual = ScientificMethod.getSin(60);
        assertEquals(0.866025403784439, actual, 15);
    }


    @Test
    public void testGetCos()
    {
        double actual = ScientificMethod.getCos(60);
        assertEquals(0.5, actual, 15);
    }


    @Test
    public void testGetTan()
    {
        double actual = ScientificMethod.getTan(60);
        assertEquals(1.732050807568877, actual, 15);
    }


    @Test
    public void testGetInverseSin()
    {
        double actual = ScientificMethod.getInverseSin(0.0274155677808);
        assertEquals(0.027419003260, actual, 15);
    }


    @Test
    public void testGetInverseCos()
    {
        double actual = ScientificMethod.getInverseCos(10);
        assertEquals(1.3953649341158527, actual, 15);
    }


    @Test
    public void testGetInverseTan()
    {
        double actual = ScientificMethod.getInverseTan(30);
        assertEquals(0.48234790710102493, actual, 15);
    }

    @Test
    public void testGetLog()
    {
        double actual = ScientificMethod.getLog(20);
        assertEquals(2.995732273553991, actual, 15);
    }


    @Test
    public void testGetFactorial()
    {
        double actual = ScientificMethod.getFactorial(20, 50);
        assertEquals(6.082818640342679E65, actual, 15);
    }









}



