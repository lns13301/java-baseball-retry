package domain;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

class Calculator {
    private static final int MIN = 1;
    private static final int COUNT = 3;
    private static final int MAX = 10;

    static List<Integer> getRandomNumbers() {
        return ThreadLocalRandom.current().ints(MIN, MAX).distinct().limit(COUNT).boxed().collect(Collectors.toList());
    }
}
