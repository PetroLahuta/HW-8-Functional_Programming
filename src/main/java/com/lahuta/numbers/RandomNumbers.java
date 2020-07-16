package main.java.com.lahuta.numbers;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumbers {
    private final int STREAM_SIZE = 15;
    private final int RANDOM_NUMBER_ORIGIN = 1;
    private final int RANDOM_NUMBER_BOUND = 101;

    List<Integer> list = new Random().ints(STREAM_SIZE, RANDOM_NUMBER_ORIGIN, RANDOM_NUMBER_BOUND)
            .boxed().collect(Collectors.toList());

    public void showRandomValues() {
        System.out.println("Task 2" + "\nRandom numbers: " + list + "\n---------------------------------");
    }

    public void ShowMinValues() {
        Integer minOfRandom = list.stream().min(Integer::compareTo).
                orElseThrow(NoSuchElementException::new);
        System.out.println("2.1. Min value of random = " + minOfRandom + "\n---------------------------------");
    }

    public void ShowMaxValue() {
        Integer maxOfRandom = list.stream().max(Integer::compareTo).
                orElseThrow(NoSuchElementException::new);
        System.out.println("2.2. Max value of random = " + maxOfRandom + "\n---------------------------------");
    }

    public void showMultipelsValues(int multiples) {
        List<Integer> multiplesList = list.stream().filter((n1) -> n1 % multiples == 0).
                collect(Collectors.toList());
        System.out.println("2.3. Values multiples of two: " + multiplesList
                + "\n---------------------------------");
    }

    public void showIncreaseValue(int increaser) {
        List<Integer> plusTenList = list.stream().map(n -> n + increaser).collect(Collectors.toList());
        System.out.println("2.4. Increase the value by 10: " + plusTenList +
                "\nRandom numbers: " + list + "\n---------------------------------");
    }
}