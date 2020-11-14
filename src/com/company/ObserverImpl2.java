package com.company;

public class ObserverImpl2 implements Observer {
    private int counter;
        @Override
    public void update(Observable obs) {


        int state = ((ObservableImpl1)obs).getState();
        if(state %2 ==0 ) ++counter;
        System.out.println("***********ObserverImpl2*********");
        System.out.println("Nouvelle mise à jour : state = "+state);
        System.out.println("Résultat de calcul = "+counter);
        System.out.println("**************************************");


    }


}
