/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jonathan
 */
public class Bidder implements Observer{
    
    private final String bidderName;
    
    public Bidder (String bidderName){
        this.bidderName = bidderName;
    }
    
    @Override
    public void update(Observer o, String productName, Double amount) {
        System. out.println(o + " ha pujado por " + productName + " en " + amount);
    }
   
}
