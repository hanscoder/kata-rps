package com.givval.kata.oop.rps;

public class Hand implements Shape {

    private final String name;
    private Rule rule;

    public Hand(String aName) {
        name = aName;
    }

    public void add(Rule aRule) {
        rule = aRule;
    }

    @Override
    public void tryToBeat(Shape oponent, Result result) {
        rule.evaluate(oponent, result);
    }

    private void evaluate(Shape oponent, Result result) {
        rule.evaluate(oponent, result);
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
