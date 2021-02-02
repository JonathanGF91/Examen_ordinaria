
package model;


public interface Subject {
    
    public void registerObserver (Observer o);
    public void removeObserver (Observer o);
    public void notifyObserver();
    public void setBidAmount (Observer o, Double amount);
  
}
