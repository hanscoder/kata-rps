package com.givval.kata.oop.rps.rule;

import com.givval.kata.oop.rps.Shape;
import com.givval.kata.oop.rps.Win;

public class Beat implements Rule<Win> {

    private final Shape looser;

    public static Rule beat(Shape oponent) {
        return new Beat(oponent);
    }

    private Beat(Shape oponent) {
        this.looser = oponent;
    }

    @Override
    public void evaluate(Shape oponent, Win result) {
        if (looser.equals(oponent)) {
            result.hasWon();
        }
    }
}
