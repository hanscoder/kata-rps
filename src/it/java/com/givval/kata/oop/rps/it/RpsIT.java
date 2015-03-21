package com.givval.kata.oop.rps.it;

import com.givval.kata.oop.rps.ShapeBox;
import com.givval.kata.oop.rps.Result;
import com.givval.kata.oop.rps.Shape;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class RpsIT {

    private ShapeBox box = new ShapeBox();
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
    public void scissor_beats_against_lizard() {
        scissors().tryToBeat(lizard(), result);

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
    public void paper_beats_spock() {
        paper().tryToBeat(spock(), result);

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

    @Test
    public void rock_beats_lizard() {
        rock().tryToBeat(lizard(), result);

        verify(result).hasWon();
    }

    @Test
    public void spock_beats_scissors() {
        spock().tryToBeat(scissors(), result);

        verify(result).hasWon();
    }

    @Test
    public void spock_beats_rock() {
        spock().tryToBeat(rock(), result);

        verify(result).hasWon();
    }

    @Test
    public void spock_against_spock_leads_to_a_tied_game() {
        spock().tryToBeat(spock(), result);

        verify(result).isTied();
    }

    @Test
    public void spock_looses_against_lizard() {
        spock().tryToBeat(lizard(), result);

        verify(result).hasLost();
    }

    @Test
    public void spock_looses_against_paper() {
        spock().tryToBeat(paper(), result);

        verify(result).hasLost();
    }

    @Test
    public void lizard_beats_paper() {
        lizard().tryToBeat(paper(), result);

        verify(result).hasWon();
    }

    @Test
    public void lizard_against_lizard_leads_to_a_tied_game() {
        lizard().tryToBeat(lizard(), result);

        verify(result).isTied();
    }

    @Test
    public void lizard_beats_spock() {
        lizard().tryToBeat(spock(), result);

        verify(result).hasWon();
    }

    @Test
    public void lizard_loose_against_rock() {
        lizard().tryToBeat(rock(), result);

        verify(result).hasLost();
    }

    @Test
    public void lizard_loose_against_scissors() {
        lizard().tryToBeat(scissors(), result);

        verify(result).hasLost();
    }

    private Shape spock() {
        return box.spock();
    }

    private Shape lizard() {
        return box.lizard();
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
