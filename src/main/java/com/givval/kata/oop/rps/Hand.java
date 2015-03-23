package com.givval.kata.oop.rps;

import com.givval.kata.oop.rps.result.Result;
import com.givval.kata.oop.rps.rule.Rule;

import static com.givval.kata.oop.rps.rule.DoNothing.doNothing;

class Hand implements Shape {

    private final String name;
    private Rule rule = doNothing();

    public Hand(String aName) {
        name = aName;
    }

    public void follow(Rule aRule) {
        rule = aRule;
    }

    @Override
    public void tryToBeat(Shape opponent, Result result) {
        rule.evaluate(opponent, result);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hand hand = (Hand) o;

        if (name != null ? !name.equals(hand.name) : hand.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

}
