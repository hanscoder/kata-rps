package com.givval.kata.oop.rps;

import static com.givval.kata.oop.rps.rule.Beats.beats;
import static com.givval.kata.oop.rps.rule.LooseAgainstAll.looseAgainstTheRest;
import static com.givval.kata.oop.rps.rule.RulesInOrder.rulesInOrder;
import static com.givval.kata.oop.rps.rule.TiedAgainst.tiedAgainst;

public class ShapeSelection {

    private final Hand rock = new Hand("rock");
    private final Hand scissors = new Hand("scissors");
    private final Hand paper = new Hand("paper");
    private final Hand lizard = new Hand("lizard");
    private final Hand spock = new Hand("spock");

    public ShapeSelection() {
        rock.follow(rulesInOrder(beats(scissors), beats(lizard), tiedAgainst(rock), looseAgainstTheRest()));
        scissors.follow(rulesInOrder(beats(paper), beats(lizard), tiedAgainst(scissors), looseAgainstTheRest()));
        paper.follow(rulesInOrder(beats(rock), beats(spock), tiedAgainst(paper), looseAgainstTheRest()));
        spock.follow(rulesInOrder(beats(scissors), beats(rock), tiedAgainst(spock), looseAgainstTheRest()));
        lizard.follow(rulesInOrder(beats(paper), beats(spock), tiedAgainst(lizard), looseAgainstTheRest()));
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
