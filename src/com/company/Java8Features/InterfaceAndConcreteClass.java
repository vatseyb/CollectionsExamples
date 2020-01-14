package com.company.Java8Features;

import java.awt.*;
import java.io.*;

/*Purpose: Program to demonstrate the Interface and it's implementation
Date: 01-07-2020
Author: Bhuvi Vatsey
 */

public class InterfaceAndConcreteClass {

//Rectangle class implements and declares the Interface Shape
    static class Rectangle implements Shape {
        double length;
        double breadth;

        public double area(double length, double breadth) {
            double areaR = length * breadth;
            return areaR;
        }
    }

//Circle class implements and declares the Interface Shape
    static class Circle implements Shape {
        double radius;

        public double area(double pivalue ,double radius) {
            double areaC = pivalue * (Math.pow(radius, 2));
            return areaC;
        }
    }

    public static void main(String args[]) {
        Rectangle objRectagle = new Rectangle();
        double areaRectangle = objRectagle.area(5,4);
        System.out.println("Rectangle Area:" + areaRectangle);

        Circle objCircle = new Circle();
        double areaCircle = objCircle.area(3.14,5);
        System.out.println("Circle Area:" + areaCircle);

    }
}

