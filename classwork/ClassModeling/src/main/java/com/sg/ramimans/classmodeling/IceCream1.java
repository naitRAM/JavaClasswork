package com.sg.ramimans.classmodeling;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 2, 2021
 * purpose: abstracting ice cream in controller of a dairy 
 */
public class IceCream1 {
    
    private String baseIngredient;
    private int sugarContent;
    private int milkContent;
    private int iceContent;
    
    
    public IceCream1 (String baseIngredient, int sugarContent, int milkContent, int iceContent) {
        
        this.baseIngredient = baseIngredient;
        this.sugarContent = sugarContent;
        this.milkContent = milkContent;
        this.iceContent = iceContent;
    }

    public String getBaseIngredient() {
        return baseIngredient;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public int getMilkContent() {
        return milkContent;
    }

    public int getIceContent() {
        return iceContent;
    }
    
    public void setBaseIngredient(String baseIngredient) {
        this.baseIngredient = baseIngredient;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public void setMilkContent(int milkContent) {
        this.milkContent = milkContent;
    }

    public void setIceContent(int iceContent) {
        this.iceContent = iceContent;
    }
    
    public void makeIceCream () {
        
    }
    
    
}
