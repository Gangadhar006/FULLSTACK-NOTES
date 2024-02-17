package design_patterns.behavioural.strategy_dp.quack;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("squeaking");
    }
}
