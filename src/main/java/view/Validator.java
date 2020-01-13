package view;

import java.util.List;

class Validator {
    private static final int CONTINUE = 1;
    private static final int EXIT = 2;
    private static final int NUMBER_LIMIT = 3;

    static int isSelectionCorrectException(int value) {
        if (value == CONTINUE || value == EXIT) {
            return value;
        }
        throw new NumberFormatException();
    }

    static List<Integer> isNumberLimitCorrect(List<Integer> numbers) {
        if (numbers.size() == NUMBER_LIMIT) {
            return numbers;
        }
        throw new NumberFormatException();
    }
}
