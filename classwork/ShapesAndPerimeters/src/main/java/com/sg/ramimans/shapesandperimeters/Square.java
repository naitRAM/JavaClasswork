package com.sg.ramimans.shapesandperimeters;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 4, 2021
 * purpose: 
 */
public class Square extends Shape{
    float side;
    public Square(float side, String color) {
        this.side = side;
        this.color = color;
    }
    @Override
    public float getArea() {
        return this.side * this.side;
    }
    @Override
    public float getPerimeter() {
        return this.side * 4;
    }
    @Override
    public String getColor() {
        return this.color;
    }
}
