/**
 * 
 */
package com.java.javabasics;

/**
 * @author Dell 5470
 *
 */
public class Rectangle {
	int width, height;

    // Default constructor
    public Rectangle() {}

    // Parameterized constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Getter for width
    public int getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(int width) {
        this.width = width;
    }

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(int height) {
        this.height = height;
    }

}
