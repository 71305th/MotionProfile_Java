package me.hong.mptest1;

public class Point2D {

    double x = 0;
    double y = 0;

    public Point2D(double ix, double iy) {
        x = ix;
        y = iy;
    }

    //    point2D operator+(final point2D &rhs);
    //    Point2D operator-(const Point2D &rhs);
    //    Point2D operator*(double scalar) const;
    //    Point2D operator/(double scalar) const;

    public Point2D plus(Point2D left, Point2D right) {
        double x = left.getX() + right.getX();
        double y = left.getY() + right.getY();
        return new Point2D(x, y);
    }

    // this one is wrong
    public Point2D plus1(Point2D[] point2DS) {
        double x = 0;
        double y = 0;
        for (Point2D point2D : point2DS) {
            x += point2D.getX();
            y += point2D.getY();
        }
        return new Point2D(x, y);
    }

    public Point2D minus(Point2D left, Point2D right) {
        double x = left.getX() - right.getX();
        double y = left.getY() - right.getY();
        return new Point2D(x, y);
    }

    public Point2D multiply(Point2D left, Point2D right) {
        double x = left.getX() * right.getX();
        double y = left.getY() * right.getY();
        return new Point2D(x, y);
    }

    // this one is wrong
    public Point2D multiply1(Point2D[] point2DS) {
        double x = 1;
        double y = 1;
        for (Point2D point2D : point2DS) {
            if (point2D.getX() != 0)
                x *= point2D.getX();
            else
                x = 0;
            if (point2D.getY() != 0)
                y *= point2D.getY();
            else
                y = 0;
        }
        return new Point2D(x, y);
    }

    public Point2D divide(Point2D left, Point2D right) {
        double x = left.getX() / right.getX();
        double y = left.getY() / right.getY();
        return new Point2D(x, y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getMagnitude() {
        return Math.hypot(x, y);
    }

    public void printXandY() {
        System.out.println("x: " + x + "y: " + y);
    }

    public double getAngle() {
        return Math.atan2(y, x);
    }

    public double distanceTo(Point2D b) {
        return 0;
    }

    public double getAngleTo(Point2D b) {
        return angleBetween(this, b);
    }

    public Point2D subtract(Point2D a, Point2D b) {
        return new Point2D((a.getX() - b.getX()), (a.getY() - b.getY()));
    }

    public double distanceBetween(Point2D a, Point2D b) {
        double dx = a.getX() - b.getX();
        double dy = a.getY() - b.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double angleBetween(Point2D a, Point2D b) {
        Point2D c = subtract(a, b);
        return Math.atan2(c.getY(), c.getX());
    }

}
