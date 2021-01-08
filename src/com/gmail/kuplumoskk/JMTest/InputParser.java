package com.gmail.kuplumoskk.JMTest;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InputParser {
    public static boolean isRoman;
    static boolean isRomanLeft;
    static boolean isRomanRight;

    public static String[] parseInput() throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);
            StringTokenizer st = new StringTokenizer(scanner.nextLine(), "+-*/", true);

            String left = st.nextToken();
            String operator = st.nextToken();
            String right = st.nextToken();

            for (int i = 0; i < 10; i++) {
                if (left.equals(RomanConverter.romans[i])) {
                    isRomanLeft = true;
                }
                if (right.equals(RomanConverter.romans[i])) {
                    isRomanRight = true;
                }
            }

            if (isRomanLeft && isRomanRight) {
                isRoman = true;
            } else if (!isRomanLeft && !isRomanRight) {
                isRoman = false;
            } else {
                throw new Exception("Illegal numbers");
            }

            if (!isRoman) {
                if (Integer.parseInt(left) < 0 || Integer.parseInt(left) > 10 || Integer.parseInt(right) < 0 || Integer.parseInt(right) > 10) {
                    throw new Exception("Number is too small/big, only numbers from 1 to 10 supported");
                }
            }


            return new String[]{left, operator, right};

        } catch (NoSuchElementException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Wrong operation in expression, only +, -, * and / supported");
        }
        return new String[0];

    }
}
