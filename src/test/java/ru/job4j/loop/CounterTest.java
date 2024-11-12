package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToThirtyThenThirty() {
        int start = 1;
        int finish = 30;
        int result = Counter.sumByEven(start, finish);
        int expected = 240;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTenToZeroThenZero() {
        int start = 10;
        int finish = 0;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusTwentyToMinusNineThenMinusNinety() {
        int start = -20;
        int finish = -9;
        int result = Counter.sumByEven(start, finish);
        int expected = -90;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusTwentyToMinusThirtyThenMinusNinety() {
        int start = -20;
        int finish = -30;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

}