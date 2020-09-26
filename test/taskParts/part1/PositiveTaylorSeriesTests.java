package taskParts.part1;

import static taskParts.part1.SinusModule.taylorSeriesSin;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PositiveTaylorSeriesTests {
    private double functionArgument;
    private int termsNumber;
    private int precision;

    public PositiveTaylorSeriesTests(double functionArgument, int termsNumber, int precision) {
        this.functionArgument = functionArgument;
        this.termsNumber = termsNumber;
        this.precision = precision;
    }

    @Parameterized.Parameters(name="x = {0}; termsNumber = {1}")
    public static Collection parameters() {
        return Arrays.asList(new Object[][] {
                // Positive <= 360 angles
                { Math.PI/2, 200, 4 }, 
                { Math.PI, 200, 4 }, 
                { 3 * Math.PI/2, 200, 4 }, 
                { 2 * Math.PI, 200, 4 }, 
                { 0.333, 200, 4 }, 
                { 1.5, 200, 4 }, 
                { 2.5, 200, 4 }, 
                { 3.5, 200, 4 }, 
                { 6.00001, 200, 4 }, 

                // Positive > 360 angles
                { 5 * Math.PI/2, 200, 4 }, 
                { 7 * Math.PI/2, 200, 4 }, 
                { 3 * Math.PI, 200, 4 }, 
                { 4 * Math.PI, 200, 4 }, 
                { 999, 200, 4 },
                { 250.54321, 200, 4 }, 

                // Negative >= -360 angles
                { -Math.PI/2, 200, 4 }, 
                { -Math.PI, 200, 4 }, 
                { -3*Math.PI/2, 200, 4 }, 
                { -2*Math.PI, 200, 4 }, 
                { -0.333, 200, 4 }, 
                { -1.5, 200, 4 }, 
                { -2.5, 200, 4 }, 
                { -3.5, 200, 4 }, 
                { -6.001, 200, 4 },

                // Negative < -360 angles
                { -5 * Math.PI/2, 200, 4 }, 
                { -7 * Math.PI/2, 200, 4 }, 
                { -3 * Math.PI, 200, 4 }, 
                { -4 * Math.PI, 200, 4 }, 
                { -999, 200, 4 },
                { -250.543, 200, 4 },

                // Varying a number of terms
                { Math.PI/2, 4, 3 }, 
                { Math.PI/2, 10, 4 }, 
                { Math.PI/2, 20, 4 }, 

                // Zero angle check
                { 0, 200, 4 }, 
        });
    }

    @Test
    public void test_taylorSeriesSin_Equals_MathSin() {
        Assert.assertEquals(
                taylorSeriesSin(functionArgument, termsNumber).setScale(precision, RoundingMode.HALF_UP),
                BigDecimal.valueOf(Math.sin(functionArgument)).setScale(precision, RoundingMode.HALF_UP)
        );
    }
}
