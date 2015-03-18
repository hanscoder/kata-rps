package com.givval.kata.oop.rps;

public class Beats implements Rule {

    private final Shape aOponent;

    public static Rule beats(Shape aOponent) {
        return new Beats(aOponent);
    }

    private Beats(Shape aOponent) {
        this.aOponent = aOponent;
    }

    @Override
    public void evaluate(Shape oponent, Result result) {
        if (aOponent.equals(oponent)) {
            result.hasWon();
        }
    }
}
