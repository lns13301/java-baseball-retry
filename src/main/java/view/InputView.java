package view;

import domain.Converter;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static List<Integer> inputNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        String value = scanner.nextLine();

        try {
            Integer.parseInt(value);
           return Converter.convertStringToIntegerList(value);
        } catch (NumberFormatException e) {
            System.out.println("정수형 숫자가 아닙니다.");
        }
        return inputNumbers();
    }

    public static int inputMenu() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
        System.out.println("게임을 새로 시작하시려면 1, 종료하시려면 2를 입력하세요.");
        String value = scanner.nextLine();

        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("정수형 숫자가 아닙니다.");
        }
        return inputMenu();
    }
}
