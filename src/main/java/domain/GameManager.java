package domain;

import view.InputView;
import view.OutputView;

import java.util.List;

public class GameManager {
    private static final int CONTINUE = 2;
    private static final int WIN = 3;

    public static void menu() {
        play();

        if (InputView.inputMenu() == CONTINUE) {
            menu();
        }
    }

    private static void play() {
        List<Integer> numbers;
        int strike;

        Computer computer = new Computer();
        do {
            numbers = InputView.inputNumbers();
            strike  = computer.countStrike(numbers);
            OutputView.showResult(strike, computer.countBall(numbers, strike));
        } while (strike == WIN);
    }
}
