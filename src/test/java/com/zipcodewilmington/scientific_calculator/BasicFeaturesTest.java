package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicFeatures;
import org.junit.Assert;
import org.junit.Test;


public class BasicFeaturesTest {

    public BasicFeaturesTest()
    {
    }

    @Test
    public void testAddWithDecimal()
    {
        double num1 = 3.478;
        double num2 = 4.947;
        double expected = 8.425;
        double actual = BasicFeatures.add(num1, num2);
        Assert.assertEquals(expected, actual, 15);
    }


    @Test
    public void testAddWithThousands()
    {
        double num1 = 6478;
        double num2 = 2947;
        double expected = 9425;
        double actual = BasicFeatures.add(num1, num2);
        Assert.assertEquals(expected, actual, 15);
    }


    @Test
    public void testMinusWithDecimal()
    {
        double num1 = 40.384;
        double num2 = 28.420;
        double expected = 11.964;
        double actual = BasicFeatures.minus(num1, num2);
        Assert.assertEquals(expected, actual, 15);
    }


    @Test
    public void testMinusWithThousands()
    {
        double num1 = 50384;
        double num2 = 44420;
        double expected = 5964;
        double actual = BasicFeatures.minus(num1, num2);
        Assert.assertEquals(expected, actual, 15);
    }


    @Test
    public void testMultipleWithDecimal()
    {
        double num1 = 34.384;
        double num2 = 10.420;
        double expected = 358.28128;
        double actual = BasicFeatures.multiple(num1, num2);
        Assert.assertEquals(expected, actual, 15);
    }


    @Test
    public void testMultipleWithThousands()
    {
        double num1 = 27284;
        double num2 = 39475;
        double expected = 1077035900;
        double actual = BasicFeatures.multiple(num1, num2);
        Assert.assertEquals(expected, actual, 15);
    }


    @Test
    public void testDivisionWithDecimal()
    {
        double num1 = 48.39;
        double num2 = 10.420;
        double expected = 4.64395393;
        double actual = BasicFeatures.division(num1, num2);
        Assert.assertEquals(expected, actual, 15);
    }


    @Test
    public void testDivisionWithThousands()
    {
        double num1 = 3849339;
        double num2 = 29420;
        double expected = 130.840891;
        double actual = BasicFeatures.division(num1, num2);
        Assert.assertEquals(expected, actual, 15);
    }
}

