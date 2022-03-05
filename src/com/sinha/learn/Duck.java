package com.sinha.learn;

public abstract class Duck {
    //we have made FlyBehavior and QuackBehavior as interfaces and created multiple implementations of them.
    //e.g. fly with wings, No fly etc. Similarly Quack, silence, squeak. By doing this we are avoiding being locked down
    // to one behavior. Imagine if I created a duck with fly() and quack() as a behavior implementations within the
    // the Duck class, any other class extending would have automatically got these behaviors.
    // Now up to this point it is still fine:
    // but imagine we adding more different types of ducks in the future where fly and quack behavior are not consistent
    // or requires change. Rubber duck which can not fly? By normal inheritance rules Rubber duck since its extending the Duck class
    // its automatically flying. So option I would have had is to override flying behavior in RubberDuck.
    // But it does not stop here... i have to now add a new class called DecoyDuck which neither quacks and not Fly. So need to override
    // both the method in this class as well.
    // Point is every new class - May require a different implementation of quack and fly! So you always have to override that new
    // behavior. Someone may forget overriding this behavior leaving rubber duck flying always. Plus this overriden behavior is not
    // reusable.

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

/*    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }*/

    public abstract void display();

    public void swim(){
        System.out.println("all ducks float");
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    // as a improvement we are now creating setters for these 2 behaviors. Now we can set these 2 behaviors at run time.

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
