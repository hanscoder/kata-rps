package com.givval.kata.oop.rps;

public class Hand implements Shape {

    private final String name;

    public Hand(String aName) {
        name = aName;
    }

    @Override
    public void tryToBeat(Shape oponent, Result result) {
        if (this.equals(oponent)) {
            result.hasBeenTied();
        }
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
