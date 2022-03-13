package ru.learnup.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Properties.xml");
        Calculator calculator = context.getBean(Calculator.class);

        int result1 = calculator.sum(1, 2);
        System.out.println(result1);

        int result2 = calculator.substract(3, 5);
        System.out.println(result2);

        int result3 = calculator.divide(3,5);
        System.out.println(result3);

        int result4 = calculator.multiply(5, 5);
        System.out.println(result4);


    }
}
