package design_patterns.behavioural.strategy_dp.fly;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
