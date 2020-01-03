package domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {
    @Test
    void randomTest() {
        List<Integer> randomNumbers = new Calculator().getRandomNumbers();

        assertThat(randomNumbers.size()).isEqualTo(3);
        assertThat(randomNumbers.stream().noneMatch(num -> num < 1)).isEqualTo(true);
        assertThat(randomNumbers.stream().noneMatch(num -> num > 9)).isEqualTo(true);
    }

}