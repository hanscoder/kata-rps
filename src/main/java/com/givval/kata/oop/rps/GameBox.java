package com.givval.kata.oop.rps;

import static com.givval.kata.oop.rps.TiedAgainst.tiedAgainst;

public class GameBox {

    private final Hand rock = new Hand("rock");

    public GameBox() {
        rock.add(tiedAgainst(rock));
    }

    public Shape rock() {
        return rock;
    }

}
