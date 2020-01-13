package view;

public class OutputView {
    private static final int EMPTY = 0;

    public static void showResult(int strike, int ball) {
        if (strike > EMPTY) {
            System.out.print(strike + "스트라이크 ");
        }
        if (ball > EMPTY) {
            System.out.print(ball + "볼 ");
        }
        if (ball == EMPTY && strike == EMPTY) {
            System.out.print("낫싱");
        }
        System.out.println();
    }

    public static void showEnd() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
    }
}
