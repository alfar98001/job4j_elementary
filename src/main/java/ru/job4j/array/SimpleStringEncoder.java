package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++; // Увеличиваем счётчик, если символ повторяется
            } else {
                result += symbol; // Добавляем символ в результат
                if (counter > 1) {
                    result += counter; // Если было повторение, добавляем число
                }
                symbol = input.charAt(i); // Обновляем текущий символ
                counter = 1; // Сбрасываем счётчик
            }
        }

        // Добавляем последний символ и его счётчик (если >1)
        result += symbol;
        if (counter > 1) {
            result += counter;
        }

        return result;
    }
}