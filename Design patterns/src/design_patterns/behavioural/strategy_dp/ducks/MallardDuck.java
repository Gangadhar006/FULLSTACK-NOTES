package design_patterns.behavioural.strategy_dp.ducks;

import design_patterns.behavioural.strategy_dp.fly.FlyWithWings;
import design_patterns.behavioural.strategy_dp.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("mallard duck");
    }
}
