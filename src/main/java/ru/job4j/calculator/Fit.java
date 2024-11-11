package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
         return (height - 100) * 1.15;
    }

    public static double womanWeight(short height2) {
          return (height2 - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        short height2 = 170;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height2);
        System.out.println("Man 187 cm is " + man + " kg");
        System.out.println("Woman 170 cm is " + woman + " kg");
    }
}
