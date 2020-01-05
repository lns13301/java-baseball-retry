package domain;

import view.InputView;
import view.OutputView;

import java.util.List;

public class GameManager {
    private static final int WIN = 3;

    public void play() {
        List<Integer> numbers;
        int strike;

        Computer computer = new Computer();
        do {
            numbers = InputView.InputNumbers();
            strike  = computer.countStrike(numbers);
            OutputView.showResult(strike, computer.countBall(numbers, strike));
        } while (strike == WIN);
    }
}
