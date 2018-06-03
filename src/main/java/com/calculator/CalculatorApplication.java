package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

class Application {

    public static class Calculator {

        public int add(int number1, int number2) {
            return number1 + number2;
        }

        public int substract(int number1, int number2) {
            return number1 - number2;
        }
    }
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result = calculator.substract(50, 25);

        System.out.println(result);
    }
}
