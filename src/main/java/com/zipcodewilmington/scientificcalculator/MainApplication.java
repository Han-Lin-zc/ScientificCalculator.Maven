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
        String input = "";
        while (!input.equals("exit")){
             input = Console.getStringInput("Enter a command.");
            //switch on this value for all possible commands
            switch (input)
            {
                case "CLEAR":
                    break;
                case "HELP":
                    break;
                case "SWITCH_DISPLAY":
                    break;
                case "SWITCH_TRIG":
                    break;
                case "STORE":
                    break;
                case "MATH":
                    System.out.println("add, subtract, multiply, divide, square, sqrt, invsqrt," +
                            "sin, cos, tan, invSin, invCos, invTan, log, invLog, natLog, invNatLog, factorial");
                    break;
                case "RESET":
                    break;
                case "RECALL":
                    break;
                case "DISPLAY":
                    break;
                case "TOGGLE_NEGATIVE":
                    break;
                case "add":
                  firstInput = Console.getDoubleInput("Input first number. ");
                  secondInput = Console.getDoubleInput("Input second number. ");
                  answer = BasicFeatures.add(firstInput, secondInput);
                  System.out.println(answer);

            }

        }
    }

}
