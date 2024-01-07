package design_patterns.behavioural.strategy_dp.quack;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("quacking");
    }
}
