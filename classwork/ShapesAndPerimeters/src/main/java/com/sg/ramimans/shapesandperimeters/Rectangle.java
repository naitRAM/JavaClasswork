package com.sg.ramimans.shapesandperimeters;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 4, 2021
 * purpose: 
 */
public class Rectangle extends Shape {
        float length;
        float width;
    public Rectangle (float length, float width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }
    @Override
    public float getArea() {
        return this.length * this.width;
    }
    @Override
    public float getPerimeter() {
        return this.length * 2 + this.width * 2;
    }
    
}
