package me.hong.mptest1;

public class math {

    private Point2D point2D;

    //this math is wrong
    public double getCircumRadius(Point2D a, Point2D b, Point2D c) {
        double a1 = b.distanceTo(c);
        double b1 = c.distanceTo(a);
        double c1 = a.distanceTo(b);

        double a2 = a1 * a1;
        double b2 = b1 * b1;
        double c2 = c1 * c1;

        double va = (a2 * (b2 + c2 - a2) / ((b1 + c1) * (b1 + c1) - a2) / (a2 - (b1 - c1) * (b1 - c1)));
        double vb = (b2 * (a2 + c2 - b2) / ((a1 + c1) * (a1 * c1) - b2) / (b2 - (a1 - c1) * (a1 - c1)));
        double vc = (c2 * (a2 + b2 - c2) / ((a1 + b1) * (a1 + b1) - c2) / (c2 - (a1 - b1) * (a1 - b1)));
        Point2D pa = new Point2D(a.getX() * va, a.getY() * va);
        Point2D pb = new Point2D(b.getX() * vb, b.getY() * vb);
        Point2D pc = new Point2D(c.getX() * vc, c.getY() * vc);

        Point2D center = point2D.plus(point2D.plus(pa, pb), pc);
        return center.distanceTo(a);
    }

    //this one is correct
    public double getCircumRadius2(Point2D a, Point2D b, Point2D c) {
        double a1 = b.distanceTo(c);
        double b1 = c.distanceTo(a);
        double c1 = a.distanceTo(b);

        double semiPerimeter = (a1 + b1 + c1) / 2.0;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - a1) * (semiPerimeter - b1) * (semiPerimeter - c1));
        double radius = a1 * b1 * c1 / area / 4.0;
        return radius;
    }
}
