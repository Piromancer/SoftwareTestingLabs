package lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import static lab2.scarySystemSolver.*;
import static lab2.taylorTrigonometry.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;

public class SystemSolverTests {
    @Test
    public void test_test() {
        //Assertions.assertNotEquals();
        Assertions.assertEquals(2, solveSystem(-2));
    }

    @Test
    public void test_sin() {
        //Assertions.assertNotEquals();
        Assertions.assertEquals(2, sin(Math.PI));
    }

    @Test
    public void test_cos() {
        //Assertions.assertNotEquals();
        Assertions.assertEquals(2, cos(Math.PI));
    }

    @Test
    public void test_tan() {
        //Assertions.assertNotEquals();
        Assertions.assertEquals(2, tan(Math.PI));
    }

    @Test
    public void test_ctg() {
        //Assertions.assertNotEquals();
        Assertions.assertEquals(2, ctg(Math.PI));
    }

    @Test
    public void test_csc() {
        //Assertions.assertNotEquals();
        Assertions.assertEquals(2, csc(Math.PI));
    }
}
