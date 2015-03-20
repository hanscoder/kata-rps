package com.givval.kata.oop.rps.rule;

import com.givval.kata.oop.rps.Shape;
import com.givval.kata.oop.rps.Tied;

public class TiedAgainst implements Rule<Tied> {
    private final Shape equalOponent;

    public static Rule tiedAgainst(Shape oponent) {
        return new TiedAgainst(oponent);
    }

    private TiedAgainst(Shape oponent) {
        this.equalOponent = oponent;
    }

    @Override
    public void evaluate(Shape oponent, Tied result) {
        if (equalOponent.equals(oponent)) {
            result.hasBeenTied();
        }
    }
}