/**
 * 
 */
package com.java.javabasics;

/**
 * @author Dell 5470
 *
 */
public class TestRectangle extends Rectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
        r1.setWidth(10);
        r1.setHeight(20);

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Height: " + r1.getHeight());

        // Using parameterized constructor
        Rectangle r2 = new Rectangle(30, 40);

        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + r2.getWidth());
        System.out.println("Height: " + r2.getHeight());

	}

}
