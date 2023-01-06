package me.hong.mptest1;

//vel accel pos time
public class struct {
    public class Trajectory {
        double vel;
        double accel;
        double position;
        double time;
    }

    public class VelWithCurvature {
        double vel;
        double curvature;

        void VelWithCurvature(double ivel, double icurvature) {
            vel = ivel;
            curvature = icurvature;
        }
    }

    //vel accel position curvature
    public class TrajectoryPoint {
        double vel;
        double accel;
        double position;
        double curvature;
    }

    public class PointWithCurvature {
        Point2D point;
        double curvature;
    }

    public class InterpolatingVelWithCurvature {
        InterpolatingMap<double, double> vel;
        InterpolatingMap<double, double> curvature;
    }

    public class KinematicConstraints {
        double maxVel;
        double maxAccel;
        double maxJerk;

        KinematicConstraints(double imaxVel, double imaxAccel, double imaxJerk) {
            maxVel = imaxVel;
            maxAccel = imaxAccel;
            maxJerk = imaxJerk;
        }

    }

}
