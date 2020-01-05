package view;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static void InputNumbers() {
        System.out.println("숫자를 입력해주세요.");
        String value = scanner.nextLine();
    }
}
