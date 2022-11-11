package com.mir00r.reviewsolicitors;

/**
 * @author mir00r on 11/11/22
 * @project IntelliJ IDEA
 */
class Segment
{
    public static Areas areas(double r, double a) {
        double inside = Math.PI * r * r;

        double halfPi = (r * r) / 2;
        double x = a * (Math.PI / 180);
        double y = Math.sin(x);

        double outside = halfPi * (x - y);

        return new Areas(inside, outside);
    }

    public static class Areas {
        public final double inside, outside;

        public Areas(double inside, double outside) {
            this.inside = inside;
            this.outside = outside;
        }
    }

    public static void main(String[] args) {
        Areas areas = Segment.areas(10, 90);
        System.out.println("Areas: " + areas.inside + ", " + areas.outside);
    }
}
