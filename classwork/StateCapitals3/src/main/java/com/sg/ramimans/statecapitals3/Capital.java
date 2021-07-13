package com.sg.ramimans.statecapitals3;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 11, 2021
 * purpose: 
 */
public class Capital {
    private final String name;
    private long population;
    private final int squareMileage;
    
    public Capital (String name, long population, int squareMileage) {
        this.name = name;
        this.population = population;
        this.squareMileage = squareMileage;
    }

    public String getName() {
        return this.name;
    }

    public long getPopulation() {
        return this.population;
    }

    public int getSquareMileage() {
        return this.squareMileage;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
    
    
}
