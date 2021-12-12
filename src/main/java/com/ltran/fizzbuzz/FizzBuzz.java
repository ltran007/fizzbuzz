package com.ltran.fizzbuzz;

import java.util.Map;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static void main(String[] args) {
        //fizzbuzz();
        fizzbuzz(Map.of(3, FIZZ, 5, BUZZ));
    }

    public static void fizzbuzz() {
        IntStream.rangeClosed(1, 100)
                .mapToObj(FizzBuzz::calculateFizzBuzz)
                .forEach(System.out::println);
    }

    public static void fizzbuzz(Map<Integer, String> divisorsAndExpectedOutput) {
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> calculateFizzBuzz(i, divisorsAndExpectedOutput))
                .forEach(System.out::println);
    }

    public static String calculateFizzBuzz(int number) {
        if (((number % 3) == 0) && ((number % 5) == 0))
            return FIZZ + BUZZ;
        else if ((number % 3) == 0)
            return FIZZ;
        else if ((number % 5) == 0)
            return BUZZ;
        else
            return String.valueOf(number);
    }

    public static String calculateFizzBuzz(int number, Map<Integer, String> divisorsAndExpectedOutput) {
        StringBuilder result = new StringBuilder();

        divisorsAndExpectedOutput.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEachOrdered(e -> {
                    if ((number % e.getKey()) == 0) {
                        result.append(e.getValue());
                    }
                });

        return result.length() == 0 ? String.valueOf(number) : result.toString();
    }

}
