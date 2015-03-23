package com.givval.kata.oop.rps.rule;

import com.givval.kata.oop.rps.result.Lost;
import com.givval.kata.oop.rps.Shape;

public class LooseAgainstAll implements Rule<Lost> {

    private static final LooseAgainstAll looseAgainstAll = new LooseAgainstAll();

    public static Rule looseAgainstTheRest() {
        return looseAgainstAll;
    }

    @Override
    public void evaluate(Shape opponent, Lost result) {
        result.hasLost();
    }
}
