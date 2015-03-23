package com.givval.kata.oop.rps;

import com.givval.kata.oop.rps.result.Result;

public interface Shape {

    void tryToBeat(Shape opponent, Result result);

}
