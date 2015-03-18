package com.givval.kata.oop.rps.it;

import com.givval.kata.oop.rps.GameBox;
import com.givval.kata.oop.rps.Result;
import com.givval.kata.oop.rps.Shape;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class RpsIT {

    @Test
    public void rock_against_rock_leads_to_a_tied_game() {
        GameBox box = new GameBox();
        Shape rock1 = box.rock();
        Shape rock2 = box.rock();
        Result result = Mockito.mock(Result.class);

        rock1.tryToBeat(rock2, result);

        verify(result).hasBeenTied();
    }

    @Test
    public void rock_beats_scissors() {
        GameBox box = new GameBox();
        Shape rock = box.rock();
        Shape scissors = box.scissors();
        Result result = Mockito.mock(Result.class);

        rock.tryToBeat(scissors, result);

        verify(result).hasWon();
    }

    @Test
    public void rock_looses_against_paper() {
        GameBox box = new GameBox();
        Shape rock = box.rock();
        Shape paper = box.paper();
        Result result = Mockito.mock(Result.class);

        rock.tryToBeat(paper, result);

        verify(result).hasLost();
    }
}
