package com.example;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting greeting1 = () -> System.out.println("We are family");
        greeting1.sayHello();

        IntBinaryOperator calculator = (int x, int y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return  (x + y ) * randomNumber;
        };


        System.out.println(calculator.applyAsInt(3, 5));
    }
}
