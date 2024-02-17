package design_patterns.behavioural.strategy_dp.ducks;

import design_patterns.behavioural.strategy_dp.fly.FlyBehaviour;
import design_patterns.behavioural.strategy_dp.quack.QuackBehaviour;

public abstract class Duck {
    protected QuackBehaviour quackBehaviour;
    protected FlyBehaviour flyBehaviour;

    public void swim() {
        System.out.println("swimming");
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
