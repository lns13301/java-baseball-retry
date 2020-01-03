package domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ComputerTest {
    @Test
    void countBallTest() {
        Computer computer = new Computer();
        List<Integer> numbers = new ArrayList<>();

        assertThat(computer.countBall(numbers)).isEqualTo(0);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        assertThat(computer.countBall(numbers)).isEqualTo(3);
    }
}