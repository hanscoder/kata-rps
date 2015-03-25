package com.givval.kata.oop.rps;

import static com.givval.kata.oop.rps.rule.Beat.beat;
import static com.givval.kata.oop.rps.rule.InOrder.inOrder;
import static com.givval.kata.oop.rps.rule.LooseAgainstAll.looseAgainstTheRest;
import static com.givval.kata.oop.rps.rule.TiedAgainst.tiedAgainst;

public class RpslsGame {
    private final Hand rock = new Hand("rock");
    private final Hand scissors = new Hand("scissors");
    private final Hand paper = new Hand("paper");
    private final Hand lizard = new Hand("lizard");
    private final Hand spock = new Hand("spock");

    public RpslsGame() {
        explainRulesToHands();
    }

    private void explainRulesToHands() {
        rock.follow(inOrder(beat(scissors), beat(lizard), tiedAgainst(rock), looseAgainstTheRest()));
        scissors.follow(inOrder(beat(paper), beat(lizard), tiedAgainst(scissors), looseAgainstTheRest()));
        paper.follow(inOrder(beat(rock), beat(spock), tiedAgainst(paper), looseAgainstTheRest()));
        spock.follow(inOrder(beat(scissors), beat(rock), tiedAgainst(spock), looseAgainstTheRest()));
        lizard.follow(inOrder(beat(paper), beat(spock), tiedAgainst(lizard), looseAgainstTheRest()));
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
