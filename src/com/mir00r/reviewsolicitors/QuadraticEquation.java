package com.mir00r.reviewsolicitors;

/**
 * @author mir00r on 9/11/22
 * @project IntelliJ IDEA
 */
public class QuadraticEquation {
    public static Roots findRoots(double a, double b, double c) {
        double delta = (b * b) - 4 * (a * c);
        double x = (- b - Math.sqrt(delta)) / (2 * a);
        double y = (- b + Math.sqrt(delta)) / (2 * a);
        return new Roots(x, y);
    }

    public static void main(String[] args) {
        Roots roots = QuadraticEquation.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
}
