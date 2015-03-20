package com.givval.kata.oop.rps.rule;

import com.givval.kata.oop.rps.Lost;
import com.givval.kata.oop.rps.Result;
import com.givval.kata.oop.rps.Shape;

public class LooseAgainstAll implements Rule<Lost> {

    public static Rule looseAgainstTheRest() {
        return new LooseAgainstAll();
    }

    @Override
    public void evaluate(Shape oponent, Lost result) {
        result.hasLost();
    }
}
