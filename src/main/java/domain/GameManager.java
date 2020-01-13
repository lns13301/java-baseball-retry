package domain;

import view.InputView;
import view.OutputView;

import java.util.List;

public class GameManager {
    private static final int RESET = 0;
    private static final int CONTINUE = 1;
    private static final int WIN = 3;
    private static int tryTimes;

    public static void menu() {
        tryTimes = RESET;
        play();
        OutputView.showEnd();

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
            tryTimes++;
        } while (strike != WIN);
    }

    public static int getTryTimes() {
        return tryTimes;
    }
}
