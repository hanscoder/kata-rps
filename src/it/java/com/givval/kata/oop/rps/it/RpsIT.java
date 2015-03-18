package com.givval.kata.oop.rps.it;

import com.givval.kata.oop.rps.GameBox;
import com.givval.kata.oop.rps.Result;
import com.givval.kata.oop.rps.Shape;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class RpsIT {

    private GameBox box = new GameBox();

    @Test
    public void rock_against_rock_leads_to_a_tied_game() {
        Result result = Mockito.mock(Result.class);

        rock().tryToBeat(rock(), result);

        verify(result).hasBeenTied();
    }

    @Test
    public void rock_beats_scissors() {
        Result result = Mockito.mock(Result.class);

        rock().tryToBeat(scissors(), result);

        verify(result).hasWon();
    }

    @Test
    public void rock_looses_against_paper() {
        Result result = Mockito.mock(Result.class);

        rock().tryToBeat(paper(), result);

        verify(result).hasLost();
    }

    @Test
    public void scissor_beats_against_paper() {
        Result result = Mockito.mock(Result.class);

        scissors().tryToBeat(paper(), result);

        verify(result).hasWon();
    }

    @Test
    public void scissors_against_scissors_leads_to_a_tied_game() {
        Result result = Mockito.mock(Result.class);

        scissors().tryToBeat(scissors(), result);

        verify(result).hasBeenTied();
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
