package me.hong.mptest1;

import java.util.ArrayList;
import java.util.List;

public class DescretePath {

    List<Point2D> path = new ArrayList<>();
    double deltaLength;
    double distance;

    public void setDistance(double idistance){
        distance = idistance;
    }

    public double getDistance(){
        return distance;
    }

    public void setDeltaLength(double ilength){
        deltaLength = ilength;
    }

    public double getDeltaLength(){
        return deltaLength;
    }

    public void pushBack(Point2D point){
        path.add(point);
    }

    public void popBack(){
        // Remove the last element
        path.remove(path.size() - 1);
    }

    public Point2D back(){
        // Get the last value
        return path.get(path.size() - 1);
    }

    public int getSize(){
        return path.size();
    }

    public double getCurvature(int index){
        if (index <= 0 || (long long unsigned int)index > path.size()){
            return 0;
        }
        double radius = Math::getCircumRadius2(path[index -1], path[index], path[index +1]);

        if (std::isnan(radius)){
            return 0;
        }
        return (1.0 / radius);
    }

    void DescretePathWithCurvature::setDistance(double idistance){
        distance = idistance;
    }

    double DescretePathWithCurvature::getDistance(){
        return distance;
    }

    void DescretePathWithCurvature::setDeltaLength(double ilength){
        deltaLength = ilength;
    }

    double DescretePathWithCurvature::getDeltaLength(){
        return deltaLength;
    }


    int DescretePathWithCurvature::getSize(){
        return path.size();
    }

    double DescretePathWithCurvature::getCurvature(int index){
        if (index <= 0 || (long long unsigned int)index >= path.size()){
            return curvature[index];
        }
        double radius = Math::getCircumRadius2(path[index -1], path[index], path[index +1]);
        bool isNeg = std::signbit(curvature[index]);
        if (isNeg) radius *= -1;
        if (std::isnan(radius)) return 0;
        return (1.0 / radius);
    }
}
