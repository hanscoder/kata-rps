package com.givval.kata.oop.rps.rule;

import com.givval.kata.oop.rps.result.Result;
import com.givval.kata.oop.rps.Shape;

public class DoNothing implements Rule<Result> {

    private static DoNothing doNothing = new DoNothing();

    public static DoNothing doNothing() {
        return doNothing;
    }

    @Override
    public void evaluate(Shape opponent, Result result) {
        // do nothing
    }
}
