package domain;

import java.util.List;
import java.util.stream.IntStream;

public class Computer {
    private static final int START = 0;
    private Calculator calculator = new Calculator();
    private List<Integer> numbers;

    public Computer() {
        this.numbers = calculator.getRandomNumbers();
    }

    public int countBall(List<Integer> numbers) {
        return (int) this.numbers.stream().filter(numbers::contains).count();
    }

    public int countStrike(List<Integer> numbers) {
        return IntStream
                .range(START, numbers.size()).filter(idx -> this.numbers.get(idx)
                .equals(numbers.get(idx)))
                .findFirst()
                .orElse(numbers.size());
    }
}
