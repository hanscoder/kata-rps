package com.givval.kata.oop.rps;

public class GameBox {

    private final Hand rock;

    public GameBox() {
        rock = new Hand("rock");

        rock.add(new IsTiedAgainstItself(rock));
    }

    public Shape rock() {
        return rock;
    }

}
