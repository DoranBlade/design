package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NotifyAbstract implements Notify {

    private List<Observer> observers;

    NotifyAbstract() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void Attach(Observer in) {
        observers.add(in);
    }

    @Override
    public void Detach(Observer in) {
        observers.remove(in);
    }

    @Override
    public void Notify() {
        this.observers.forEach(observer -> observer.update(status()));
    }
}
