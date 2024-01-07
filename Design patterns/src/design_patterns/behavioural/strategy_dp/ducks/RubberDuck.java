package design_patterns.behavioural.strategy_dp.ducks;

import design_patterns.behavioural.strategy_dp.fly.FlyNoWay;
import design_patterns.behavioural.strategy_dp.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("rubber duck");
    }
}
