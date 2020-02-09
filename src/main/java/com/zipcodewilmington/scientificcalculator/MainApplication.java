package com.zipcodewilmington.scientificcalculator;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        double answer = 0;
        double firstInput = 0;
        double secondInput = 0;
        float thirdInput = 0;
        String input = "";
        double store = 0;

        while (!input.equals("exit")) {

             input = Console.getStringInput("Enter a command.");

            //switch on this value for all possible commands

            switch (input.toLowerCase().replace("_", " "))
            {
                case "clear":
                    store = 0;
                    break;

                case "help":
                    System.out.println("CLEAR HELP SWITCH_DISPLAY SWITCH_TRIG " +
                            "STORE MATH RESET RECALL DISPLAY TOGGLE_NEGATIVE");
                    break;

                case "switch display":
                    input = Console.getStringInput("Input which display.");
                    ScientificMethod.DisplayMode.valueOf(input);
                    ScientificMethod.DisplayMode input1 = ScientificMethod.DisplayMode.valueOf(input);
                    ScientificMethod.switchDisplayMode(input1);
                    break;

                case "switch trig":

                    break;

                case "store":
                    store = answer;
                    break;

                case "math":
                    System.out.println("+, -, *, /, square, sqrt, invSqrt," +
                            "sin, cos, tan, invSin, invCos, invTan, log, invLog, factorial");
                    break;

                case "reset":
                    break;

                case "recall":
                    break;

                case "display":
                    System.out.println(store);
                    break;

                case "toggle negative":
                    answer = -answer;
                    System.out.println(answer);
                    break;

                case "+":
                  firstInput = Console.getDoubleInput("Input first number. ");
                  secondInput = Console.getDoubleInput("Input second number. ");
                  answer = BasicFeatures.add(firstInput, secondInput);
                  System.out.println(answer);
                  break;

                case "-":
                    firstInput = Console.getDoubleInput("Input first number.");
                    secondInput = Console.getDoubleInput("Input second number.");
                    answer = BasicFeatures.minus(firstInput, secondInput);
                    System.out.println(answer);
                    break;

                case "*":
                    firstInput = Console.getDoubleInput("Input first number.");
                    secondInput = Console.getDoubleInput("Input second number.");
                    answer = BasicFeatures.multiple(firstInput, secondInput);
                    System.out.println(answer);
                    break;

                case "/":
                    firstInput = Console.getDoubleInput("Input first number.");
                    secondInput = Console.getDoubleInput("Input second number.");
                    answer = BasicFeatures.division(firstInput, secondInput);
                    System.out.println(answer);
                    break;

                case "square":
                    firstInput = Console.getDoubleInput("Input a number.");
                    answer = ScientificMethod.getSquare(firstInput);
                    System.out.println(answer);
                    break;

                case "invSqrt":
                    thirdInput = Console.getFloatInput("Input a number.");
                    answer = ScientificMethod.invSqrt(thirdInput);
                    System.out.println(answer);
                    break;

                case "sqrt":
                    thirdInput = Console.getFloatInput("Input a number.");
                    answer = ScientificMethod.sqrt(thirdInput);
                    System.out.println(answer);
                    break;

                case "sin":
                    firstInput = Console.getDoubleInput("Input a number.");
                    answer = ScientificMethod.getSin(firstInput);
                    System.out.println(answer);
                    break;

                case "cos":
                    firstInput = Console.getDoubleInput("Input a number");
                    answer = ScientificMethod.getCos(firstInput);
                    System.out.println(answer);
                    break;

                case "tan":
                    firstInput = Console.getDoubleInput("Input a number");
                    answer = ScientificMethod.getTan(firstInput);
                    System.out.println(answer);
                    break;

                case "invSin":
                    firstInput = Console.getDoubleInput("Input a number");
                    answer = ScientificMethod.getInverseSin(firstInput);
                    System.out.println(answer);
                    break;

                case "invCos":
                    firstInput = Console.getDoubleInput("Input a number");
                    answer = ScientificMethod.getInverseCos(firstInput);
                    System.out.println(answer);
                    break;

                case "invTan":
                    firstInput = Console.getDoubleInput("Input a number");
                    answer = ScientificMethod.getInverseTan(firstInput);
                    System.out.println(answer);
                    break;

                case "log":
                    firstInput = Console.getDoubleInput("Input a number");
                    answer = ScientificMethod.getLog(firstInput);
                    System.out.println(answer);
                    break;

                case "factorial":
                    firstInput = Console.getDoubleInput("Input a factorial.");
                    secondInput = Console.getDoubleInput("Input a end value.");
                    answer = ScientificMethod.getFactorial(firstInput, secondInput);
                    System.out.println(answer);
                    break;


            }

        }
    }

}
