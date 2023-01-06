package me.hong.mptest1;

public class Kinematics {
    double trackWidth;

    public Kinematics(double itrackWidth) {
        trackWidth = itrackWidth;
    }

    double toRightWheelSpeeds(double linearSpeed, double angularVelocity){
        return (linearSpeed + trackWidth / 2 * angularVelocity);
    }

    double toLeftWheelSpeeds(double linearSpeed, double angularVelocity){
        return (linearSpeed - trackWidth / 2 * angularVelocity);
    }

    double toRightWheelSpeeds2(double linearSpeed, double curvature){
        return linearSpeed * (2 + curvature * trackWidth) / 2;
    }

    double toLeftWheelSpeeds2(double linearSpeed, double curvature) {
        return linearSpeed * (2 - curvature * trackWidth) / 2;
    }
}
