package com.givval.kata.oop.rps.rule;

import com.givval.kata.oop.rps.Result;
import com.givval.kata.oop.rps.Shape;

public class Beat implements Rule {

    private final Shape aOponent;

    public static Rule beat(Shape aOponent) {
        return new Beat(aOponent);
    }

    private Beat(Shape aOponent) {
        this.aOponent = aOponent;
    }

    @Override
    public void evaluate(Shape oponent, Result result) {
        if (aOponent.equals(oponent)) {
            result.hasWon();
        }
    }
}
