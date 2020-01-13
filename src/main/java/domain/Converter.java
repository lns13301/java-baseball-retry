package domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Converter {
    private static final String EMPTY = "";

    public static List<Integer> convertStringToIntegerList(String value) {
        return Arrays.stream(value.split(EMPTY))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
    }
}
