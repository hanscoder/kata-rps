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
}
