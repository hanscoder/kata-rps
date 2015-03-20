package com.givval.kata.oop.rps.rule;

import com.givval.kata.oop.rps.Result;
import com.givval.kata.oop.rps.Shape;
import com.givval.kata.oop.rps.Win;

public class Beat implements Rule<Win> {

    private final Shape aOponent;

    public static Rule beat(Shape aOponent) {
        return new Beat(aOponent);
    }

    private Beat(Shape aOponent) {
        this.aOponent = aOponent;
    }

    @Override
    public void evaluate(Shape oponent, Win result) {
        if (aOponent.equals(oponent)) {
            result.hasWon();
        }
    }
}
