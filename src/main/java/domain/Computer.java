package domain;

import java.util.List;

public class Computer {
    private Calculator calculator = new Calculator();
    private List<Integer> numbers;

    public Computer() {
        this.numbers = calculator.getRandomNumbers();
    }

    public int countBall(List<Integer> numbers) {
        return (int) this.numbers.stream().filter(numbers::contains).count();
    }
}
