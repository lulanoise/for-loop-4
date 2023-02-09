package it.develhope.forloop;

import java.util.Random;

public class CustomNumber {
    private int number;

    public CustomNumber() {
        Random random = new Random();
        this.number = random.nextInt(1,12);
        System.out.println("The random number is " + number);
    }
    public void getMultiplicationTable() {
        for (int i = 12; i >= 1; i--){
            System.out.println(number + " multiplied by " + i + " = " + number * i);
        }
    }
}