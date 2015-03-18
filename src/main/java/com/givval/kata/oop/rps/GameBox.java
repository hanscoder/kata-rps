package com.givval.kata.oop.rps;

import static com.givval.kata.oop.rps.Beats.beats;
import static com.givval.kata.oop.rps.Rules.rules;
import static com.givval.kata.oop.rps.TiedAgainst.tiedAgainst;

public class GameBox {

    private final Hand rock = new Hand("rock");
    private Hand scissors = new Hand("scissors");

    public GameBox() {
        rock.follow(rules(beats(scissors), tiedAgainst(rock)));
    }

    public Shape rock() {
        return rock;
    }

    public Shape scissors() {
        return scissors;
    }

}
