package com.givval.kata.oop.rps;

import static com.givval.kata.oop.rps.rule.Beats.beats;
import static com.givval.kata.oop.rps.rule.LooseAgainstAll.looseAgainstAll;
import static com.givval.kata.oop.rps.rule.Rules.rules;
import static com.givval.kata.oop.rps.rule.TiedAgainst.tiedAgainst;

public class GameBox {

    private final Hand rock = new Hand("rock");
    private Hand scissors = new Hand("scissors");
    private Hand paper = new Hand("paper");

    public GameBox() {
        rock.follow(rules(beats(scissors), tiedAgainst(rock), looseAgainstAll()));
        scissors.follow(rules(beats(paper), tiedAgainst(scissors), looseAgainstAll()));
        paper.follow(rules(beats(rock), tiedAgainst(paper), looseAgainstAll()));
    }

    public Shape rock() {
        return rock;
    }

    public Shape scissors() {
        return scissors;
    }

    public Shape paper() {
        return paper;
    }

}
