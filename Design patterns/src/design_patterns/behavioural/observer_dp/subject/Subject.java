package design_patterns.behavioural.observer_dp.subject;

import design_patterns.behavioural.observer_dp.observers.Observer;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
