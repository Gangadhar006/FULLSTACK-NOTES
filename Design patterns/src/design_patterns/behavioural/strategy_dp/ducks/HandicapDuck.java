package design_patterns.behavioural.strategy_dp.ducks;

import design_patterns.behavioural.strategy_dp.fly.FlyNoWay;
import design_patterns.behavioural.strategy_dp.quack.Quack;

public class HandicapDuck extends Duck {

    public HandicapDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("handicapped duck");
    }
}
