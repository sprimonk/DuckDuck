package com.sinha.learn;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<SILENCE>");
    }
}
