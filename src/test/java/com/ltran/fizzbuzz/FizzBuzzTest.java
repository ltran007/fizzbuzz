package com.ltran.fizzbuzz;

import org.junit.Test;

import java.util.Map;

import static com.ltran.fizzbuzz.FizzBuzz.*;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private static final int NUMBER_DIVISIBLE_BY_3 = 6;
    private static final int NUMBER_DIVISIBLE_BY_5 = 10;
    private static final int NUMBER_DIVISIBLE_BY_3_AND_BY_5 = 15;
    private static final int NUMBER_DIVISIBLE_BY_NEITHER = 11;
    private static final Map<Integer, String> DIVISORS_AND_EXPECTED_OUTPUT = Map.of(3, FIZZ, 5, BUZZ);

    @Test
    public void returnFizzWhenDivisibleBy3() {
        assertThat(calculateFizzBuzz(NUMBER_DIVISIBLE_BY_3)).isEqualTo(FIZZ);
    }

    @Test
    public void returnBuzzWhenDivisibleBy5() {
        assertThat(calculateFizzBuzz(NUMBER_DIVISIBLE_BY_5)).isEqualTo(BUZZ);
    }

    @Test
    public void returnFizzBuzzWhenDivisibleBy3AndBy5() {
        assertThat(calculateFizzBuzz(NUMBER_DIVISIBLE_BY_3_AND_BY_5)).isEqualTo(FIZZ + BUZZ);
    }

    @Test
    public void returnNumberWhenDivisibleByNeither() {
        assertThat(calculateFizzBuzz(NUMBER_DIVISIBLE_BY_NEITHER)).isEqualTo(String.valueOf(NUMBER_DIVISIBLE_BY_NEITHER));
    }

    @Test
    public void returnExpectedOutputWhenDivisibleByDivisor() {
        assertThat(calculateFizzBuzz(NUMBER_DIVISIBLE_BY_3, DIVISORS_AND_EXPECTED_OUTPUT)).isEqualTo(FIZZ);
        assertThat(calculateFizzBuzz(NUMBER_DIVISIBLE_BY_5, DIVISORS_AND_EXPECTED_OUTPUT)).isEqualTo(BUZZ);
        assertThat(calculateFizzBuzz(NUMBER_DIVISIBLE_BY_3_AND_BY_5, DIVISORS_AND_EXPECTED_OUTPUT)).isEqualTo(FIZZ + BUZZ);
    }

    @Test
    public void returnNumberWhenDivisibleByNoDivisor() {
        assertThat(calculateFizzBuzz(NUMBER_DIVISIBLE_BY_NEITHER, DIVISORS_AND_EXPECTED_OUTPUT))
                .isEqualTo(String.valueOf(NUMBER_DIVISIBLE_BY_NEITHER));
    }

}
