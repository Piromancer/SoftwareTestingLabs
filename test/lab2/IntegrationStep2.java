package lab2;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static lab2.ScarySystemSolver.solveSystem;
import static lab2.TaylorTrigonometry.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegrationStep2 {

    // cos tests

    @Test
    public void test_cos_negative_argument_0() {
        assertEquals(BigDecimal.valueOf(1).setScale(4, RoundingMode.HALF_UP), cos(0).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_cos_negative_argument_PI_div_3() {
        assertEquals(BigDecimal.valueOf(0.5000).setScale(4, RoundingMode.HALF_UP), cos(-Math.PI/3).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_cos_negative_argument_PI_div_4() {
        assertEquals(BigDecimal.valueOf(0.7072), cos(-Math.PI/4).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_cos_negative_argument_PI_div_6() {
        assertEquals(BigDecimal.valueOf(0.8659), cos(-Math.PI/6).setScale(4, RoundingMode.HALF_UP));
    }

    // tan tests

    @Test
    public void test_tan_negative_argument_0() {
        assertEquals(BigDecimal.valueOf(1.0000).setScale(4, RoundingMode.HALF_UP), cos(0).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_tan_negative_argument_PI_div_3() {
        assertEquals(BigDecimal.valueOf(0.5000).setScale(4, RoundingMode.HALF_UP), cos(-Math.PI/3).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_tan_negative_argument_PI_div_4() {
        assertEquals(BigDecimal.valueOf(0.7072), cos(-Math.PI/4).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_tan_negative_argument_PI_div_6() {
        assertEquals(BigDecimal.valueOf(0.8659), cos(-Math.PI/6).setScale(4, RoundingMode.HALF_UP));
    }

    // ctg tests

    @Test
    public void test_ctg_negative_argument_0() {
        assertThrows(ArithmeticException.class, () -> ctg(0).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_ctg_negative_argument_PI_div_3() {
        assertEquals(BigDecimal.valueOf(-0.5774), ctg(-Math.PI/3).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_ctg_negative_argument_PI_div_4() {
        assertEquals(BigDecimal.valueOf(-1.0000).setScale(4, RoundingMode.HALF_UP), ctg(-Math.PI/4).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_ctg_negative_argument_PI_div_6() {
        assertEquals(BigDecimal.valueOf(-1.7318), ctg(-Math.PI/6).setScale(4, RoundingMode.HALF_UP));
    }

    // csc tests

    @Test
    public void test_csc_negative_argument_0() {
        assertThrows(ArithmeticException.class, () -> csc(0).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_csc_negative_argument_PI_div_3() {
        assertEquals(BigDecimal.valueOf(-1.1547).setScale(4, RoundingMode.HALF_UP), csc(-Math.PI/3).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_csc_negative_argument_PI_div_4() {
        assertEquals(BigDecimal.valueOf(-1.4140).setScale(4, RoundingMode.HALF_UP), csc(-Math.PI/4).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_csc_negative_argument_PI_div_6() {
        assertEquals(BigDecimal.valueOf(-2.0000).setScale(4, RoundingMode.HALF_UP), csc(-Math.PI/6).setScale(4, RoundingMode.HALF_UP));
    }

    // log tests

    @Test
    public void test_log_2_4_equals_2() {
        assertEquals(BigDecimal.valueOf(2.0001), log(4, 2).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_log_3_27_equals3() {
        assertEquals(BigDecimal.valueOf(2.9994), log(27, 3).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_log_5_1_equals_0() {
        assertEquals(BigDecimal.valueOf(0.0000).setScale(4, RoundingMode.HALF_UP), log(1, 5).setScale(4, RoundingMode.HALF_UP));
    }

    @Test
    public void test_log_10_1div10_equals_negative_1() {
        assertEquals(BigDecimal.valueOf(-1.0000).setScale(4, RoundingMode.HALF_UP), log(0.1, 10).setScale(4, RoundingMode.HALF_UP));
    }

}
