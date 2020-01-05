package view;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static void InputNumbers() {
        System.out.println("숫자를 입력해주세요.");
        String value = scanner.nextLine();

        try {
            Integer.parseInt(value);
            List<Integer> numbers = Converter.convertStringToIntegerList(value);
        } catch (NumberFormatException e) {
            System.out.println("정수형 숫자가 아닙니다.");
        }
    }
}
