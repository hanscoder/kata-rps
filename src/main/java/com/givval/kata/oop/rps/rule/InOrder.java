package com.givval.kata.oop.rps.rule;

import com.givval.kata.oop.rps.Result;
import com.givval.kata.oop.rps.Shape;

public class InOrder implements Rule<Result> {
    private final Rule[] rules;

    public static Rule inOrder(Rule... rules) {
        return new InOrder(rules);
    }

    private InOrder(Rule... rules) {
        this.rules = rules;
    }

    @Override
    public void evaluate(Shape opponent, Result result) {
        for (Rule rule : rules) {
            rule.evaluate(opponent, result);
        }
    }
}
