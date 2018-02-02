package com.qualims.maintenance.domain;

import com.qualims.maintenance.UnitTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.assertj.core.api.Assertions.assertThat;

@Category(UnitTest.class)
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void dois_retourner_1_si_intervalle_1to1() {
        assertThat(fizzBuzz.generate(1,1)).isEqualTo("1");
    }

    @Test
    public void dois_retourner_2_si_intervalle_2to2() {
        assertThat(fizzBuzz.generate(2,2)).isEqualTo("2");
    }

    @Test
    public void dois_retourner_Fizz_si_intervalle_3to3() {
        assertThat(fizzBuzz.generate(3,3)).isEqualTo("Fizz");
    }

    @Test
    public void dois_retourner_Buzz_si_intervalle_5to5() {
        assertThat(fizzBuzz.generate(5,5)).isEqualTo("Buzz");
    }

    @Test
    public void dois_retourner_FizzBuzz_si_intervalle_15to15() {
        assertThat(fizzBuzz.generate(15,15)).isEqualTo("FizzBuzz");
    }

    @Test
    public void dois_retourner_12_si_intervalle_1to2() {
        assertThat(fizzBuzz.generate(1,2)).isEqualTo("12");
    }

    @Test
    public void dois_retourner_12Fizz_si_intervalle_1to3() {
        assertThat(fizzBuzz.generate(1,3)).isEqualTo("12Fizz");
    }
}