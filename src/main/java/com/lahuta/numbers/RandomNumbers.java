package main.java.com.lahuta.numbers;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumbers {

    public static void createRandomNambers() {
        List<Integer> randomList = new Random().ints(15, 1,
                101).boxed().collect(Collectors.toList());
        System.out.println("Task 2");
        System.out.println("Random nambers: " + randomList + "\n---------------------------------");

        Integer minOfRandom = randomList.stream().min(Integer::compareTo).
                orElseThrow(NoSuchElementException::new);
        System.out.println("2.1. Min value of random = " + minOfRandom + "\n---------------------------------");

        Integer maxOfRandom = randomList.stream().max(Integer::compareTo).
                orElseThrow(NoSuchElementException::new);
        System.out.println("2.2. Max value of random = " + maxOfRandom + "\n---------------------------------");

        List<Integer> multiplesList = randomList.stream().filter((n1) -> n1 % 2 == 0).
                collect(Collectors.toList());
        System.out.println("2.3. Values multiples of two: " + multiplesList
                + "\n---------------------------------");

        List<Integer> plusTenList = randomList.stream().map(n -> n + 10).collect(Collectors.toList());
        System.out.println("2.4. Increase the value by 10: " + plusTenList +
                "\nRandom nambers: " + randomList + "\n---------------------------------");
    }
}