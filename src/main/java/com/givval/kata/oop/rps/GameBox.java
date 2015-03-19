package com.givval.kata.oop.rps;

import static com.givval.kata.oop.rps.rule.Beats.beats;
import static com.givval.kata.oop.rps.rule.LooseAgainstAll.looseAgainstAll;
import static com.givval.kata.oop.rps.rule.RulesInOrder.rulesInOrder;
import static com.givval.kata.oop.rps.rule.TiedAgainst.tiedAgainst;

public class GameBox {

    private final Hand rock = new Hand("rock");
    private Hand scissors = new Hand("scissors");
    private Hand paper = new Hand("paper");
    private Hand lizard = new Hand("lizard");
    private Hand spock = new Hand("spock");

    public GameBox() {
        rock.follow(rulesInOrder(beats(scissors), beats(lizard), tiedAgainst(rock), looseAgainstAll()));
        scissors.follow(rulesInOrder(beats(paper), tiedAgainst(scissors), looseAgainstAll()));
        paper.follow(rulesInOrder(beats(rock), tiedAgainst(paper), looseAgainstAll()));
        spock.follow(rulesInOrder(beats(scissors), beats(rock), tiedAgainst(spock), looseAgainstAll()));
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

    public Shape lizard() {
        return lizard;
    }

    public Shape spock() {
        return spock;
    }
}
