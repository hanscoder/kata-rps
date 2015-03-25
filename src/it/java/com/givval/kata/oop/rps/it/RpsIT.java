package com.givval.kata.oop.rps.it;

import com.givval.kata.oop.rps.RpsGame;
import com.givval.kata.oop.rps.result.Result;
import com.givval.kata.oop.rps.Shape;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class RpsIT {

    private RpsGame box = new RpsGame();
    private Result result = Mockito.mock(Result.class);

    @Test
    public void rock_against_rock_leads_to_a_tied_game() {
        rock().tryToBeat(rock(), result);

        verify(result).isTied();
    }

    @Test
    public void rock_beats_scissors() {
        rock().tryToBeat(scissors(), result);

        verify(result).hasWon();
    }

    @Test
    public void rock_looses_against_paper() {
        rock().tryToBeat(paper(), result);

        verify(result).hasLost();
    }

    @Test
    public void scissor_beats_against_paper() {
        scissors().tryToBeat(paper(), result);

        verify(result).hasWon();
    }

    @Test
    public void scissors_against_scissors_leads_to_a_tied_game() {
        scissors().tryToBeat(scissors(), result);

        verify(result).isTied();
    }

    @Test
    public void scissors_looses_against_rock() {
        scissors().tryToBeat(rock(), result);

        verify(result).hasLost();
    }

    @Test
    public void paper_beats_rock() {
        paper().tryToBeat(rock(), result);

        verify(result).hasWon();
    }

    @Test
    public void paper_against_paper_leads_to_a_tied_game() {
        paper().tryToBeat(paper(), result);

        verify(result).isTied();
    }

    @Test
    public void paper_looses_against_scissors() {
        paper().tryToBeat(scissors(), result);

        verify(result).hasLost();
    }

    private Shape rock() {
        return box.rock();
    }

    private Shape paper() {
        return box.paper();
    }

    private Shape scissors() {
        return box.scissors();
    }
}
