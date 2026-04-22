package Polymorphism;

import java.util.*;

class ShapeCalculator {

    // Area of Circle
    public void area(int radius) {
        double ans = 3.14 * radius * radius;
        System.out.println("Area of Circle : " + (int) ans);
    }

    // Area of Rectangle
    public void area(int length, int width) {
        int ans = length * width;
        System.out.println("Area of Rectangle : " + (int) ans);
    }

    // Area of Trapezoid
    public void area(int base1, int base2, int height) {
        double ans = 0.5 * (base1 + base2) * height;
        System.out.println("Area of Trapezoid : " + (int) ans);
    }
}

class Main {
    public static void main(String[] args) {
        // Hardcoded inputs
        int radius = 2;
        int length = 2;
        int width = 3;
        int base1 = 2;
        int base2 = 3;
        int height = 2;

        // Create object and call overloaded methods
        ShapeCalculator calc = new ShapeCalculator();
        calc.area(radius);
        calc.area(length, width);
        calc.area(base1, base2, height);
    }
}
