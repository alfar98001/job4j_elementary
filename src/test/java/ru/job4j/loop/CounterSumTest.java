package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterSumTest {

    @Test
    void whenStart10Finish23Then231() {
        int start = 10;
        int finish = 23;
        int result = CounterSum.sum(start, finish);
        int expected = 231;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart23Finish10Then0() {
        int start = 23;
        int finish = 10;
        int result = CounterSum.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}
