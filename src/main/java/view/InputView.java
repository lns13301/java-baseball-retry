package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static void InputNumbers() {
        System.out.println("숫자를 입력해주세요.");
        String value = scanner.nextLine();

        try {
            int number = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("정수형 숫자가 아닙니다.");
        }
    }
}
