package com.sg.ramimans.shapesandperimeters;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 4, 2021
 * purpose: 
 */
public class App {
    public static void main(String[] args) {
        Circle tri = new Circle(3, "green");
        System.out.println(tri.getPerimeter());
        System.out.println(tri.getArea());
        System.out.println(tri.getColor());
    }
}
