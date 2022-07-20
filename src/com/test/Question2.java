package com.test;

import java.util.ArrayList;

public class Question2 {

    public static String singleChar = "abcdefghijklmnopqrstuvwxyz";
    public static String singleNumber = "0123456789";


    public ArrayList<String> generateSecondArray(ArrayList<String> theArray) {
        boolean usingNumber = true;
        int character = singleChar.length();
        int number = singleNumber.length();
        ArrayList<String> newArray = new ArrayList<String>();
        while (newArray.size() <= 200){
            for (int i = 0; i < theArray.size() - 1; i++) {
                if (i % 2 == 0) {
                    if (usingNumber) {

                        newArray.add(String.valueOf(singleNumber.charAt(number % singleNumber.length())));
                        newArray.add(theArray.get(i));
                        //System.out.println(i);
                        //theArray.add(i, singleNumber.substring(number % singleNumber.length()));
                        number += 1;
                        usingNumber = false;
                    } else {

                        newArray.add(String.valueOf(singleChar.charAt(character % singleChar.length())));
                        newArray.add(theArray.get(i));
                        //System.out.println(i);
                        //theArray.add(i, singleNumber.substring(character % singleChar.length()));
                        character += 1;
                        usingNumber = true;
                    }
                }
            }
        }

        return newArray;
    }
}
