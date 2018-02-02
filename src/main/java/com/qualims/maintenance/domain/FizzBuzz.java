package com.qualims.maintenance.domain;

public class FizzBuzz {

    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String generate(int entierMini, int entierMaxi) {

        return evaluateNumbers(entierMini, entierMaxi);
    }

    private String evaluateNumbers(int entierMini, int entierMaxi) {
        String resultat = "";

        while (entierMini <= entierMaxi)
            resultat += evaluateNumber(entierMini++);
        return resultat;
    }

    private boolean isMultipleOf5(int valeur) {
        return valeur % 5 == 0;
    }

    private boolean isMultipleOf3(int valeur) {
        return valeur % 3 == 0;
    }

    private String evaluateNumber(int number) {
        if (isMultipleOf3(number) && isMultipleOf5(number))
            return FIZZ_BUZZ;

        if (isMultipleOf3(number))
            return FIZZ;

        if (isMultipleOf5(number))
            return BUZZ;

        return String.valueOf(number);
    }
}
