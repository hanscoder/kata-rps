package com.givval.kata.oop.rps;

public class Hand implements Shape {

    private final String name;
    private Rule rule = doNothing();

    public Hand(String aName) {
        name = aName;
    }

    public void follow(Rule aRule) {
        rule = aRule;
    }

    @Override
    public void tryToBeat(Shape oponent, Result result) {
        rule.evaluate(oponent, result);
    }

    private Rule doNothing() {
        return new Rule() {
            @Override
            public void evaluate(Shape oponent, Result result) {
                // donnothing
            }
        };
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
