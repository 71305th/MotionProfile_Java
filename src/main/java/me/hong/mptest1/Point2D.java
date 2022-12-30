package me.hong.mptest1;

import me.hong.mptest1.Base.point2D;

public class Point2D implements point2D {

    double x = 0;
    double y = 0;

    public Point2D(double ix, double iy) {
        x = ix;
        y = iy;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getMagnitude() {
        return Math.hypot(x, y);
    }

    @Override
    public void printXandY() {
        System.out.println("x: " + x + "y: " + y);
    }

    @Override
    public double getAngle() {
        return Math.atan2(y, x);
    }

    @Override
    public double distanceTo(point2D b) {
        return 0;
    }

    @Override
    public double getAngleTo(point2D b) {
        return angleBetween(this, b);
    }

    @Override
    public point2D subtract(point2D a, point2D b) {
        return new Point2D((a.getX() - b.getX()), (a.getY() - b.getY()));
    }

    @Override
    public double distanceBetween(point2D a, point2D b) {
        double dx = a.getX() - b.getX();
        double dy = a.getY() - b.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public double angleBetween(point2D a, point2D b) {
        point2D c = subtract(a, b);
        return Math.atan2(c.getY(), c.getX());
    }

}
