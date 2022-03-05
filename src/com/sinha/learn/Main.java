package com.sinha.learn;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithRocket());
        modelDuck.performFly();

    }
}
