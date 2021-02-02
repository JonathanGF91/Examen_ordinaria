
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Product implements Subject {
    
    private final List<Observer> observers = new ArrayList<>();
    private final String productName;
    private Double amount;
    private Observer observer;
    private List<HistoryBid> history = new ArrayList<>();
            
    public Product (String productName , Double amount) {
        this.productName = productName;
        this.amount  = amount;
    }
    
    @Override
    public void registerObserver (Observer o){
        System.out.println(o.getObserverName() + " se ha unido a la subasta");
        observers.add(o);
    }

    @Override
    public void removeObserver (Observer o){
        observers.remove(o);
        System.out.println("\n" + o.getObserverName() + " se retira de la puja");
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
            notifyObserver();
            history.add(new HistoryBid(new Date(), amount, o));
        }else{
            System.out.println("no supera la puja actual");
        }
    }
    
    @Override
    public void getHistory(){
        for (HistoryBid h : history){
            System.out.print("\nPujador: " + h.getBidder());
            System.out.print("Cantidad: " + h.getAmount());
            System.out.print("fecha: " + h.getDate());
        }
    }
}

