
package model;

import java.util.Date;

public class HistoryBid {
    
    private final Date date;
    private final Double amount;
    private final Observer bidder;

    public HistoryBid(Date date, Double amount, Observer bidder) {
        this.date = date;
        this.amount = amount;
        this.bidder = bidder;
    }

    public Date getDate() {
        return date;
    }

    public Double getAmount() {
        return amount;
    }

    public Observer getBidder() {
        return bidder;
    }
    
    
    
    
}
