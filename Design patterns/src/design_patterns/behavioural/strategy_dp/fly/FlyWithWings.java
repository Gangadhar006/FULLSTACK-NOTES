package design_patterns.behavioural.strategy_dp.fly;

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("flying with wings");
    }
}
