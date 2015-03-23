package com.givval.kata.oop.rps.rule;

import com.givval.kata.oop.rps.Shape;
import com.givval.kata.oop.rps.Win;

public class Beat implements Rule<Win> {

    private static Beat beat;
    private final Shape looser;

    public static Rule beat(Shape opponent) {
        beat = new Beat(opponent);
        return beat;
    }

    private Beat(Shape opponent) {
        this.looser = opponent;
    }

    @Override
    public void evaluate(Shape opponent, Win result) {
        if (looser.equals(opponent)) {
            result.hasWon();
        }
    }
}
