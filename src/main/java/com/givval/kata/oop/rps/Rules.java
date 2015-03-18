package com.givval.kata.oop.rps;

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
