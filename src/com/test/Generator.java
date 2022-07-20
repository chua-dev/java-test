package com.test;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class Generator {
    public ArrayList<String> arrayOfString = new ArrayList<String>();
    public static final String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static SecureRandom random = new SecureRandom();
    public static Random r = new Random();

    public ArrayList<String> generateAndAppend() {
        this.arrayOfString.clear();
        for(int count = 0; count < 100; ++count) {
            String eachRandom = generateSingleRandom();
            arrayOfString.add(eachRandom);
        }

        return this.arrayOfString;
    }

    public String generateSingleRandom() {
        int lowest = 10;
        int highest = 15;
        int len = r.nextInt(highest - lowest) + lowest;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++){
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }
}
