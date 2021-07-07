package com.sg.ramimans.shapesandperimeters;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 7, 2021
 * purpose: 
 */
public class Circle extends Shape{
    float radius;
    
    public Circle (float radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    
    @Override
    public float getPerimeter () {
        return (float)(2 * Math.PI * this.radius);
    }
    
    @Override
    public float getArea() {
        return (float)(Math.PI * Math.pow(radius, 2));
    }
}
