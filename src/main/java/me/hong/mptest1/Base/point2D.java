package me.hong.mptest1.Base;

import jdk.dynalink.Operation;

public interface point2D {

//    point2D operator+(final point2D &rhs);
//    Point2D operator-(const Point2D &rhs);
//    Point2D operator*(double scalar) const;
//    Point2D operator/(double scalar) const;

    double getX();
    double getY();
    double getMagnitude();
    void printXandY();

    double getAngle();
    double distanceTo(point2D b);
    double getAngleTo(point2D b);


    point2D subtract(point2D a, point2D b);

    double distanceBetween(point2D a, point2D b);

    double angleBetween(point2D a, point2D b);
}
