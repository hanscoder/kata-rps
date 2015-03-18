package com.givval.kata.oop.rps;

public class LooseAgainstAll implements Rule {

    public static Rule looseAgainstAll() {
        return new LooseAgainstAll();
    }

    @Override
    public void evaluate(Shape oponent, Result result) {
        result.hasLost();
    }
}
