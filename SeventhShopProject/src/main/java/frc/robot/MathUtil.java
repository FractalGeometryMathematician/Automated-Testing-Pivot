package frc.robot;

public class MathUtil {
    // Example: deadband function you might use for joysticks
    public static double applyDeadband(double value, double deadband) {
        if (Math.abs(value) < deadband) {
            return 0.0;
        }
        return value;
    }
}