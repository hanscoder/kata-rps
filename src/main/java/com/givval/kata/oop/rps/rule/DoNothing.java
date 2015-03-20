package com.givval.kata.oop.rps.rule;

import com.givval.kata.oop.rps.Result;
import com.givval.kata.oop.rps.Shape;
import com.givval.kata.oop.rps.rule.Rule;

public class DoNothing implements Rule<Result> {

    private static DoNothing doNothing = new DoNothing();

    public static DoNothing doNothing() {
        return doNothing;
    }

    @Override
    public void evaluate(Shape oponent, Result result) {
        // do nothing
    }
}
