package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            swap(data, i, index);
        }
        return data;
    }

    private static void swap(int[] data, int first, int second) {
        int temp = data[first];
        data[first] = data[second];
        data[second] = temp;
    }
}
