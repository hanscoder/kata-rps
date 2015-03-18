package com.givval.kata.oop.rps;

public class IsTiedAgainstItself implements Rule {
    private final Shape hand;

    public IsTiedAgainstItself(Shape hand) {
        this.hand = hand;
    }

    @Override
    public void evaluate(Shape oponent, Result result) {
        if (hand.equals(oponent)) {
            result.hasBeenTied();
        }
    }
}