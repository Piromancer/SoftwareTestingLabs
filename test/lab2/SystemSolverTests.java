package lab2;

import org.junit.Test;
import static lab2.ScarySystemSolver.*;
import static lab2.TaylorTrigonometry.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SystemSolverTests {
    @Test
    public void test_test() {
        assertEquals(2, solveSystem(-2));
    }

    @Test
    public void test_test2() {
        assertEquals(2, solveSystem(2));
    }

    @Test
    public void test_sin() {
        assertEquals(2, sin(-Math.PI/2));
    }

    @Test
    public void test_cos() {
        assertEquals(2, cos(-2));
    }

    @Test
    public void test_tan() {
        assertEquals(2, tan(-2));
    }

    @Test
    public void test_ctg() {
        assertEquals(2, ctg(-2));
    }

    @Test
    public void test_csc() {
        assertEquals(2, csc(-2));
    }

    @Test
    public void test_log_2() {
        assertEquals(4, log(16, 2));
    }

    @Test
    public void test_log_3() {
        assertEquals(3, log(27, 3));
    }
}
