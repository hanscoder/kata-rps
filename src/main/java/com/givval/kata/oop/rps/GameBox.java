package com.givval.kata.oop.rps;

public class GameBox {

    private Shape rock;

    public GameBox() {
        rock = new Hand("rock");
    }

    public Shape rock() {
        return rock;
    }

}
