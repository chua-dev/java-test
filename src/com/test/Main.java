package com.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("lala");

        // Question 1
        Generator gen = new Generator();
        ArrayList<String> answer1 = gen.generateAndAppend();
        System.out.println(answer1);
        System.out.println(answer1.size());

        // Question 2
        Question2 secondGen = new Question2();
        ArrayList<String> answer2 = secondGen.generateSecondArray(answer1);
        System.out.println(answer2);

        // Question 4
        Question4 coin = new Question4();
        ArrayList<Integer> testingNumbers = new ArrayList<Integer>();
        testingNumbers.add(2);
        testingNumbers.add(4);
        boolean possible = coin.canSumFrom(7, testingNumbers);
        System.out.println(possible);

    }
}
