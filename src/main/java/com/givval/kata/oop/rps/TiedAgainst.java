package com.givval.kata.oop.rps;

public class TiedAgainst implements Rule {
    private final Shape oponent;

    public static Rule tiedAgainst(Shape anOponent) {
        return new TiedAgainst(anOponent);
    }

    private TiedAgainst(Shape anOponent) {
        this.oponent = anOponent;
    }

    @Override
    public void evaluate(Shape oponent, Result result) {
        if (this.oponent.equals(oponent)) {
            result.hasBeenTied();
        }
    }
}