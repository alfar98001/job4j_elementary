package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "aid";
        names[1] = "kira";
        names[2] = "sam";
        names[3] = "miho";

        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + names.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println("Размер массива равен: " + names[0]);
        System.out.println("Размер массива равен: " + names[1]);
        System.out.println("Размер массива равен: " + names[2]);
        System.out.println("Размер массива равен: " + names[3]);

    }

}
