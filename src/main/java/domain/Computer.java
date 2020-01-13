package domain;

import java.util.List;
import java.util.stream.IntStream;

class Computer {
    private static final int START = 0;
    private List<Integer> numbers;

    Computer() {
        this.numbers = Calculator.getRandomNumbers();
    }

    int countBall(List<Integer> numbers, int strikeCount) {
        return (int) this.numbers.stream().filter(numbers::contains).count() - strikeCount;
    }

    int countStrike(List<Integer> numbers) {
        return (int) IntStream
                .range(START, 3)
                .filter(idx -> this.numbers.get(idx).equals(numbers.get(idx)))
                .count();
    }
}
