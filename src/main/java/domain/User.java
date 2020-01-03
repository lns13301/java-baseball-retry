package domain;

import java.util.List;

public class User {
    private Calculator calculator = new Calculator();
    private List<Integer> numbers;

    public User() {
        this.numbers = calculator.getRandomNumbers();
    }
}
