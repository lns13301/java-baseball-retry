package domain;

import view.InputView;

import java.util.List;

public class GameManager {
    private static final int WIN = 3;

    public void play() {
        List<Integer> numbers;
        Computer computer = new Computer();
        do {
            numbers = InputView.InputNumbers();
        } while (computer.countStrike(numbers) == WIN);
    }
}
