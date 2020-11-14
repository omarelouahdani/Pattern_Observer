package com.company;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl1 implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private int state= 10;
    @Override
    public void subscribe(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:observers)
        {
            o.update(this);
        }

    }
    public void setState(int state){
        this.state= state;
        this.notifyObservers();
    }

    public int getState() {
        return state;
    }
}
