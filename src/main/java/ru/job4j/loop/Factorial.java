package ru.job4j.loop;

public class Factorial {

    public static int calculate(int number) {
        int result = 1;
        for (int counter = 1; counter <= number; counter++) {
            result *= counter;
        }
        return result;
    }

}
