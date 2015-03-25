package com.givval.kata.oop.rps;

import static com.givval.kata.oop.rps.rule.Beat.beat;
import static com.givval.kata.oop.rps.rule.LooseAgainstAll.looseAgainstTheRest;
import static com.givval.kata.oop.rps.rule.InOrder.inOrder;
import static com.givval.kata.oop.rps.rule.TiedAgainst.tiedAgainst;

public class RpsGame {

    private final Hand rock = new Hand("rock");
    private final Hand scissors = new Hand("scissors");
    private final Hand paper = new Hand("paper");

    public RpsGame() {
        explainRulesToHands();
    }

    private void explainRulesToHands() {
        rock.follow(inOrder(beat(scissors), tiedAgainst(rock), looseAgainstTheRest()));
        scissors.follow(inOrder(beat(paper), tiedAgainst(scissors), looseAgainstTheRest()));
        paper.follow(inOrder(beat(rock), tiedAgainst(paper), looseAgainstTheRest()));
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
