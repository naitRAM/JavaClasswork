package com.sg.ramimans.classmodeling;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 2, 2021
 * purpose: abstracting ice cream in a grocery store stocking system
 */
public class IceCream2 {
    
    private final String producer;
    private final String flavour;
    private final int expiryDate;
    private int quantity;
    
    public IceCream2 (String producer, String flavour, int expiryDate, int quantity) {
        this.producer = producer;
        this.flavour = flavour;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    public String getProducer() {
        return producer;
    }

    public String getFlavour() {
        return flavour;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    // can only sell what we have
    public void sellItems(int amount) {
        if (amount <= this.quantity) {
            this.setQuantity(this.quantity - amount);
        }
    }
    
    
}
