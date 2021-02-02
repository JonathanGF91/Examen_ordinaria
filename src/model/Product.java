
package model;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    
    private final List<Observer> observers = new ArrayList<>();
    private final String productName;
    private Double amount;
    private Observer observer;
            
    public Product (String productName , Double amount) {
        this.productName = productName;
        this.amount  = amount;
    }
    
    @Override
    public void registerObserver (Observer o){
        System.out.println("Nuevo pujador");
        observers.add(o);
    }

    @Override
    public void removeObserver (Observer o){
        observers.remove(o);
        System.out.println("\n" + observer + " se retira de la puja");
    }
    @Override
    public void notifyObserver(){
        System.out.println("\nNueva Subasta");
        for (Observer o : observers ){
            o.update(observer , productName , amount);
        }
    } 

    @Override
    public void setBidAmount(Observer o, Double amount) {
       if (amount > this.amount){
            this.observer = o;
            this.amount = amount;
            notify();
        }else{
            System.out.println("no supera la puja actual");
        }
    }
}

