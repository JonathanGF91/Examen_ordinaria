
package model;

public interface Observer {
    public void update(Observer o,
            String productName,
            Double amount);
    
    public String getObserverName();
}
