package com.ltran.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzbuzz();
    }

    private static void fizzbuzz() {
        IntStream.rangeClosed(1, 100)
                .mapToObj(FizzBuzz::calculateFizzBuzz)
                .forEach(System.out::println);
    }

    private static String calculateFizzBuzz(int number) {
        if (((number % 3) == 0) && ((number % 5) == 0))
            return "FizzBuzz";
        else if ((number % 3) == 0)
            return "Fizz";
        else if ((number % 5) == 0)
            return "Buzz";
        else
            return String.valueOf(number);
    }

}
