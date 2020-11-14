package com.company;

public class Main {

    public static void main(String[] args) {

	    // write your code here

        ObservableImpl1 observable = new ObservableImpl1();

        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();
        Observer o3 = new ObserverImpl1();

        observable.subscribe(o1);
        observable.subscribe(o2);
        observable.subscribe(o3);
        observable.setState(55);

    }
}
