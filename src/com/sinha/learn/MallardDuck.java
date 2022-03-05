package com.sinha.learn;

public class MallardDuck extends Duck{

    @Override
    public void display() {
        System.out.println("Hey this is Mallard Duck");
    }

    public MallardDuck() {
        flyBehavior = new FlyWithWings(); // this is still coding to implementation and not coding to interface/type.
        quackBehavior = new Quack(); // this is still coding to implementation and not coding to interface/type.
    }

}
