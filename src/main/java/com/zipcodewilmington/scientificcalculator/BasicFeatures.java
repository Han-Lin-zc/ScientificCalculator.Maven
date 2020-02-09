package com.zipcodewilmington.scientificcalculator;


public class BasicFeatures {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double minus(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiple(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {

        if (num2 == 0) {

            System.out.println("Err");

        } else if (num2 != 0) {

            double num3 = num1 / num2;
            return num3;
        }
        return 0;
    }
}


