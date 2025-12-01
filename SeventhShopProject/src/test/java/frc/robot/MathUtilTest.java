package frc.robot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTest {

    @Test
    void valuesInsideDeadbandGoToZero() {
        double result = MathUtil.applyDeadband(0.05, 0.1);
        assertEquals(0.0, result, 1e-9);
    }

    @Test
    void valuesOutsideDeadbandStaySame() {
        double result = MathUtil.applyDeadband(0.5, 0.1);
        assertEquals(0.5, result, 1e-9);
    }
}