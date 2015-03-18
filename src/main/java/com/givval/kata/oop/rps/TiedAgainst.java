package com.givval.kata.oop.rps;

public class TiedAgainst implements Rule {
    private final Shape oponent;

    public Rule tiedAgainst(Shape anOponent) {
        return new TiedAgainst(anOponent);
    }

    public TiedAgainst(Shape anOponent) {
        this.oponent = anOponent;
    }

    @Override
    public void evaluate(Shape oponent, Result result) {
        if (this.oponent.equals(oponent)) {
            result.hasBeenTied();
        }
    }
}