package view;

import domain.Converter;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static List<Integer> InputNumbers() {
        System.out.print("숫자를 입력해주세요 : ");
        String value = scanner.nextLine();

        try {
            Integer.parseInt(value);
           return Converter.convertStringToIntegerList(value);
        } catch (NumberFormatException e) {
            System.out.println("정수형 숫자가 아닙니다.");
        }
        return InputNumbers();
    }
}
