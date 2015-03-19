package com.givval.kata.oop.rps;

import static com.givval.kata.oop.rps.rule.Beat.beat;
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
        explainRulesToHands();
    }

    private void explainRulesToHands() {
        rock.follow(rulesInOrder(beat(scissors), beat(lizard), tiedAgainst(rock), looseAgainstTheRest()));
        scissors.follow(rulesInOrder(beat(paper), beat(lizard), tiedAgainst(scissors), looseAgainstTheRest()));
        paper.follow(rulesInOrder(beat(rock), beat(spock), tiedAgainst(paper), looseAgainstTheRest()));
        spock.follow(rulesInOrder(beat(scissors), beat(rock), tiedAgainst(spock), looseAgainstTheRest()));
        lizard.follow(rulesInOrder(beat(paper), beat(spock), tiedAgainst(lizard), looseAgainstTheRest()));
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
