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
                    System.out.println("clear, help, switch display, switch trig, " +
                            "store, math, reset, recall, display, toggle negative.");
                    break;

                case "switch display":
                    input = Console.getStringInput("Input which display.").toUpperCase();
                    ScientificMethod.DisplayMode.valueOf(input);
                    ScientificMethod.DisplayMode input1 = ScientificMethod.DisplayMode.valueOf(input);
                    ScientificMethod.switchDisplayMode(input1);
                    break;

                case "switch trig":
                    ScientificMethod.switchTrigDisplayMode(ScientificMethod.getTrigMode() == ScientificMethod.TrigDisplayMode.DEGREES ? ScientificMethod.TrigDisplayMode.RADIANS : ScientificMethod.TrigDisplayMode.DEGREES);
                    System.out.println(ScientificMethod.getTrigMode());

                    break;

                case "store":
                    store = answer;
                    System.out.println(store);
                    break;

                case "math":
                    System.out.println("+, -, *, /, square, sqrt, invsqrt," +
                            "sin, cos, tan, invSin, invCos, invTan, log, invLog, factorial");
                    break;

                case "reset":
                    store = 0;
                    break;

                case "recall":
                    System.out.println(store);
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

                case "invsqrt":
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
                    answer = ScientificMethod.getSin(firstInput, ScientificMethod.getTrigMode());
                    System.out.println(answer);
                    break;

                case "cos":
                    firstInput = Console.getDoubleInput("Input a number");
                    answer = ScientificMethod.getCos(firstInput, ScientificMethod.getTrigMode());
                    System.out.println(answer);
                    break;

                case "tan":
                    firstInput = Console.getDoubleInput("Input a number");
                    answer = ScientificMethod.getTan(firstInput, ScientificMethod.getTrigMode());
                    System.out.println(answer);
                    break;

                case "invsin":
                    firstInput = Console.getDoubleInput("Input a number");
                    answer = ScientificMethod.getInverseSin(firstInput, ScientificMethod.getTrigMode());
                    System.out.println(answer);
                    break;

                case "invcos":
                    firstInput = Console.getDoubleInput("Input a number");
                    answer = ScientificMethod.getInverseCos(firstInput, ScientificMethod.getTrigMode());
                    System.out.println(answer);
                    break;

                case "invtan":
                    firstInput = Console.getDoubleInput("Input a number");
                    answer = ScientificMethod.getInverseTan(firstInput, ScientificMethod.getTrigMode());
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
