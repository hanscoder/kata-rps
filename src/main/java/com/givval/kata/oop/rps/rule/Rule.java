package com.givval.kata.oop.rps.rule;

import com.givval.kata.oop.rps.Result;
import com.givval.kata.oop.rps.Shape;

public interface Rule {
    void evaluate(Shape oponent, Result result);
}
