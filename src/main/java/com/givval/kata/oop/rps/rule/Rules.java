package com.givval.kata.oop.rps.rule;

import com.givval.kata.oop.rps.Result;
import com.givval.kata.oop.rps.Shape;

public class Rules implements Rule {
    private final Rule[] rules;

    public static Rule rules(Rule... rules) {
        return new Rules(rules);
    }

    private Rules(Rule... rules) {
        this.rules = rules;
    }

    @Override
    public void evaluate(Shape oponent, Result result) {
        for (Rule rule : rules) {
            rule.evaluate(oponent, result);
        }
    }
}
