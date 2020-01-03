package domain;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Calculator {
    private static final int MIN = 0;
    private static final int MAX = 9;

    public List<Integer> getRandomNumbers(int count) {
        return ThreadLocalRandom.current().ints(MIN, MAX).distinct().limit(count).boxed().collect(Collectors.toList());
    }
}
