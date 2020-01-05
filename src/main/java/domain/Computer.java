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

    public int countBall(List<Integer> numbers, int strikeCount) {
        return (int) this.numbers.stream().filter(numbers::contains).count() - strikeCount;
    }

    public int countStrike(List<Integer> numbers) {
        return (int) IntStream
                .range(START, 3)
                .filter(idx -> this.numbers.get(idx).equals(numbers.get(idx)))
                .count();
    }
}
