package com.gmail.kuplumoskk.JMTest;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("Welcome to calculator.\nEnter your expression: ");
        Calculator.calculate(RomanConverter.convertRoman(InputParser.parseInput()));
    }
}