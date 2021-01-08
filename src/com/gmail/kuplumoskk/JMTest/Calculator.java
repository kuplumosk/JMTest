package com.gmail.kuplumoskk.JMTest;

public class Calculator {
    public static void calculate(String[] inputArray) throws Exception {
        int result = 0;
        if ("+".equals(inputArray[1])) {
            result = Integer.parseInt(inputArray[0]) + Integer.parseInt(inputArray[2]);
        } else if ("-".equals(inputArray[1])) {
            result = Integer.parseInt(inputArray[0]) - Integer.parseInt(inputArray[2]);
        } else if ("*".equals(inputArray[1])) {
            result = Integer.parseInt(inputArray[0]) * Integer.parseInt(inputArray[2]);
        } else if ("/".equals(inputArray[1])) {
            result = Integer.parseInt(inputArray[0]) / Integer.parseInt(inputArray[2]);
        } else {
            throw new Exception("Unsupported operation");
        }
        if (!InputParser.isRoman) {
            System.out.print("Result is " + result);
        } else {
            System.out.print("Result is " + RomanConverter.romans[result - 1]);
        }
    }
}

