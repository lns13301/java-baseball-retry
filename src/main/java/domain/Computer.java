package domain;

import java.util.List;

public class Computer {
    private Calculator calculator = new Calculator();
    private List<Integer> numbers;

    public Computer() {
        this.numbers = calculator.getRandomNumbers();
    }
}
