package com.company.Java8Features;

import java.awt.*;
import java.io.*;

public class InterfaceAndConcreteClass {


    class Rectangle implements Shape {
        double length;
        double breadth;

        public double area() {
            double areaR = length * breadth;
            return areaR;
        }
    }

    class Circle implements Shape {
        double radius;

        public double area() {
            double areaC = 3.14 * (Math.pow(radius, 2));
            return areaC;
        }
    }

    public static void main(String args[]) {
        Rectangle objRectagle = new Rectangle();
        double areaRectangle = objRectagle.area();

        Circle objCircle = new Circle();
        double areaCircle = objCircle.area();

    }
}

