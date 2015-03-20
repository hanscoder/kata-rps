package com.givval.kata.oop.rps.rule;

import com.givval.kata.oop.rps.Result;
import com.givval.kata.oop.rps.Shape;
import com.givval.kata.oop.rps.Tied;

public class TiedAgainst implements Rule<Tied> {
    private final Shape oponent;

    public static Rule tiedAgainst(Shape anOponent) {
        return new TiedAgainst(anOponent);
    }

    private TiedAgainst(Shape anOponent) {
        this.oponent = anOponent;
    }

    @Override
    public void evaluate(Shape anOponent, Tied result) {
        if (this.oponent.equals(anOponent)) {
            result.hasBeenTied();
        }
    }
}