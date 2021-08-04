package com.company;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        System.out.println(walking(generateRandomAge(), 13));
        System.out.println(walking(generateRandomAge(), 26));
        System.out.println(walking(generateRandomAge(), 35));
        System.out.println(walking(generateRandomAge(), 42));
        System.out.println(walking(generateRandomAge(), 50));
    }

    public static String walking(int age,int temp){
        if (age > 20 && age < 45 && temp > -20 && temp < 30)
            return "Можно идти гулять";
        else if (age < 20 && temp > 0 &&  temp< 28)
            return "Можно идти гулять";
        else if (age > 45 && temp > -10 && temp < 25)
            return "Можно идти гулять";
        else return "Оставайтесь дома";
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(99);
    }
}
