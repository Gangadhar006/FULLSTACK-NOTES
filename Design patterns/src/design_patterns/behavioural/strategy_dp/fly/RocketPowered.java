package design_patterns.behavioural.strategy_dp.fly;

public class RocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("flying with rocket");
    }
}
