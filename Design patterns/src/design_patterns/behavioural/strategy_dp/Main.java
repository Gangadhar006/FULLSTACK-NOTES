package design_patterns.behavioural.strategy_dp;

import design_patterns.behavioural.strategy_dp.ducks.Duck;
import design_patterns.behavioural.strategy_dp.ducks.HandicapDuck;
import design_patterns.behavioural.strategy_dp.fly.RocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck handicapDuck = new HandicapDuck();

        handicapDuck.performFly();
        handicapDuck.setFlyBehaviour(new RocketPowered());
        handicapDuck.performFly();
    }
}
