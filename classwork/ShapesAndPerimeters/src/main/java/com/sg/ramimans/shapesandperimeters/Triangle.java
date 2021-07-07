package com.sg.ramimans.shapesandperimeters;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 7, 2021
 * purpose: 
 */
public class Triangle extends Shape{
    
    float side1;
    float side2;
    float side3;
    
    public Triangle (float side1, float side2, float side3, String color){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }
    
    @Override
    public float getPerimeter () {
        return this.side1 + this.side2 + this.side3;
    }
    
    @Override
    public float getArea () {
        // Heron's formula to calculate area using sides alone
        float semiperimeter = (side1 + side2 + side3)/2;
        return (float)Math.sqrt(semiperimeter * (semiperimeter - side1) * 
                (semiperimeter - side2) * (semiperimeter - side3));
    }
}
