package com.givval.kata.oop.rps.rule;

import com.givval.kata.oop.rps.Shape;
import com.givval.kata.oop.rps.result.Tied;

public class TiedAgainst implements Rule<Tied> {
    private final Shape equalOpponent;

    public static Rule tiedAgainst(Shape opponent) {
        return new TiedAgainst(opponent);
    }

    private TiedAgainst(Shape opponent) {
        this.equalOpponent = opponent;
    }

    @Override
    public void evaluate(Shape opponent, Tied result) {
        if (equalOpponent.equals(opponent)) {
            result.isTied();
        }
    }
}