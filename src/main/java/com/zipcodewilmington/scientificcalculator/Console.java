package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static Double getDoubleInput(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        double userInput = scanner.nextDouble();
        return userInput;
    }

    public static Float getFloatInput(String prompt)
    {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        float userInput = scanner.nextFloat();
        return userInput;
    }

    public enum Commands
    {
        CLEAR,
        HELP,
        SWITCH_DISPLAY,
        SWITCH_TRIG,
        STORE,
        MATH,
        RESET,
        RECALL,
        DISPLAY,
        TOGGLE_NEGATIVE;

        public String toString()
        {
            return this.toString().toLowerCase().replace("_", " ");
        }


    }
}
