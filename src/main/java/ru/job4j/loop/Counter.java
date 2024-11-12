package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int index = start; index <= finish; index++) {
            sum = sum + index;
        }
        return sum;
    }

    public static void testWhenStart10Finish23Then231() {
        int start = 10;
        int finish = 23;
        int result = sum(start, finish);
        int expected = 231;
        boolean success = expected == result;
        System.out.println("Test passed : " + success);
    }

    public static void testWhenStart23Finish10Then0() {
        int start = 23;
        int finish = 10;
        int result = sum(start, finish);
        int expected = 0;
        boolean success = expected == result;
        System.out.println("Test passed : " + success);
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        testWhenStart10Finish23Then231();
        testWhenStart23Finish10Then0();
    }

}
