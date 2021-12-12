package com.ltran.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static void main(String[] args) {
        fizzbuzz();
    }

    public static void fizzbuzz() {
        IntStream.rangeClosed(1, 100)
                .mapToObj(FizzBuzz::calculateFizzBuzz)
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

}
