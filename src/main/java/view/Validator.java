package view;

class Validator {
    static int isSelectionCorrectException(int value) {
        if (!(value == 1 || value == 2)) {
            throw new NumberFormatException();
        }
        return value;
    }
}
