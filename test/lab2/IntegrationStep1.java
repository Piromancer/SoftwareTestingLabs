package lab2;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static lab2.ScarySystemSolver.solveSystem;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegrationStep1 {

    // x <= 0 function tests

    @Test
    public void test_solveSystem_negative_argument_0() {
        assertThrows(ArithmeticException.class, () -> solveSystem(0).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_solveSystem_negative_argument_PI_div_3() {
        assertEquals(BigDecimal.valueOf(0.5318), solveSystem(-Math.PI/3).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_solveSystem_negative_argument_PI_div_4() {
        assertEquals(BigDecimal.valueOf(0.0606), solveSystem(-Math.PI/4).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_solveSystem_negative_argument_PI_div_6() {
        assertEquals(BigDecimal.valueOf(3.4237), solveSystem(-Math.PI/6).setScale(4, RoundingMode.HALF_UP));
    }

    // x > 0 function tests

    @Test
    public void test_solveSystem_positive_argument_1() {
        assertThrows(ArithmeticException.class, () -> solveSystem(1).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_solveSystem_positive_argument_1_div_2() {
        assertEquals(BigDecimal.valueOf(-5.0182), solveSystem(0.5).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_solveSystem_positive_argument_4() {
        assertEquals(BigDecimal.valueOf(32.1223), solveSystem(4).setScale(4, RoundingMode.HALF_UP));
    }

}
