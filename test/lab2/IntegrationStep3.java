package lab2;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static lab2.ScarySystemSolver.solveSystem;
import static lab2.TaylorTrigonometry.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationStep3 {

    // sin tests

    @Test
    public void test_sin_negative_argument_0() {
        assertEquals(BigDecimal.valueOf(0.0000).setScale(4, RoundingMode.HALF_UP), sin(0).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_sin_negative_argument_PI_div_3() {
        assertEquals(BigDecimal.valueOf(-0.8660).setScale(4, RoundingMode.HALF_UP), sin(-Math.PI/3).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_sin_negative_argument_PI_div_4() {
        assertEquals(BigDecimal.valueOf(-0.7072), sin(-Math.PI/4).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_sin_negative_argument_PI_div_6() {
        assertEquals(BigDecimal.valueOf(-0.5000).setScale(4, RoundingMode.HALF_UP), sin(-Math.PI/6).setScale(4, RoundingMode.HALF_UP));
    }

    // ln tests

    @Test
    public void test_ln_1div10() {
        assertEquals(BigDecimal.valueOf(-2.3028), ln(0.1).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_ln_1() {
        assertEquals(BigDecimal.valueOf(0.0000).setScale(4, RoundingMode.HALF_UP), ln(1).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_ln_e() {
        assertEquals(BigDecimal.valueOf(0.9998).setScale(4, RoundingMode.HALF_UP), ln(Math.E).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_ln_5() {
        assertEquals(BigDecimal.valueOf(1.6097).setScale(4, RoundingMode.HALF_UP), ln(5).setScale(4, RoundingMode.HALF_UP));
    }

    // Period tests

    @Test
    public void test_solveSystem_negativeArgument_period_check_negative_PI_div_3() {
        assertEquals(solveSystem(-2*Math.PI-Math.PI/3).setScale(4, RoundingMode.HALF_UP), solveSystem(-Math.PI/3).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_solveSystem_negativeArgument_period_check_negative_PI_div_6() {
        assertEquals(solveSystem(-6*Math.PI-Math.PI/6).setScale(4, RoundingMode.HALF_UP), solveSystem(-Math.PI/6).setScale(4, RoundingMode.HALF_UP));
    }

    // Extremes tests

    @Test
    public void test_solveSystem_negativeArgument_extreme1() {
        assertEquals(0, solveSystem(-1.3851).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_solveSystem_negativeArgument_extreme2() {
        assertEquals(BigDecimal.valueOf(0.0000), solveSystem(-0.4184).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_solveSystem_negativeArgument_extreme3() {
        assertEquals(BigDecimal.valueOf(0.0000), solveSystem(-5.5629).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_solveSystem_negativeArgument_extreme4() {
        assertEquals(BigDecimal.valueOf(0.0000), solveSystem(-4.1357).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_solveSystem_negativeArgument_extreme5() {
        assertEquals(BigDecimal.valueOf(0.0000), solveSystem(-3.7169).setScale(4, RoundingMode.HALF_UP));
    }



    // Roots tests

    @Test
    public void test_solveSystem_negativeArgument_root() {
        assertEquals(BigDecimal.valueOf(0.0000), solveSystem(-2.146).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_solveSystem_positive_root_check() {
        assertEquals(BigDecimal.valueOf(0.0095), solveSystem(1.0066).setScale(4, RoundingMode.HALF_UP));
    }

}
