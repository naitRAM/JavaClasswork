package com.sg.ramimans.classmodeling;

/**
 *
 * @author Rami Mansieh
 * email: rmansieh@gmail.com
 * data: Jul. 1, 2021
 * purpose: house in a 3D design system
 */
public class House2 {
    private float buildingHeight;
    private float buildingWidth;
    private float buildingLength;
    private String buildingColor;
    private String buildingStyle;
    
     // bare minimum is to have height, width, and length of a 3D object, but these values can mutate
    public House2 (float buildingHeight, float buildingWidth, float buildingLength) {
        this.buildingHeight = buildingHeight;
        this.buildingWidth = buildingWidth;
        this.buildingLength = buildingLength;
    }

    public float getBuildingHeight() {
        return buildingHeight;
    }

    public void setBuildingHeight(float buildingHeight) {
        this.buildingHeight = buildingHeight;
    }

    public float getBuildingWidth() {
        return buildingWidth;
    }

    public void setBuildingWidth(float buildingWidth) {
        this.buildingWidth = buildingWidth;
    }

    public float getBuildingLength() {
        return buildingLength;
    }

    public void setBuildingLength(float buildingLength) {
        this.buildingLength = buildingLength;
    }

    public String getBuildingColor() {
        return buildingColor;
    }

    public void setBuildingColor(String buildingColor) {
        this.buildingColor = buildingColor;
    }

    public String getBuildingStyle() {
        return buildingStyle;
    }

    public void setBuildingStyle(String buildingStyle) {
        this.buildingStyle = buildingStyle;
    }
    
    
    
   
}
