package com.test;

import java.util.ArrayList;

public class Question4 {

    public boolean canSumFrom(int targetValue, ArrayList<Integer> numbers) {
        int sumOfNumbers = 0;

        for (int each: numbers) {
            // Sum up the number
            sumOfNumbers += each;
            // Check For Multiply
            if (targetValue % each == 0) {
                return true;
            }
        }

        if (sumOfNumbers == targetValue) {
            return true;
        } else if (sumOfNumbers < targetValue) {
            return false;
        } else if (sumOfNumbers > targetValue) {
            int remain = sumOfNumbers - targetValue;
            if (numbers.contains(remain)) {
                return true;
            } else {
                return false;
            }
        }

        return false;
    }
}
