package taskParts.part1;

import static taskParts.part1.SinusModule.taylorSeriesSin;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;

public class NegativeTaylorSeriesTests {

    @Test
    public void test_taylorSeriesSin_throwsArithmeticException_When_numberTerms_Equals_Zero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {taylorSeriesSin(0, 0);});
    }

    @Test
    public void test_taylorSeriesSin_throwsArithmeticException_When_numberTerms_isNegative() {
        Assertions.assertThrows(ArithmeticException.class, () -> {taylorSeriesSin(0, -2);});
    }

    @Test
    public void test_taylorSeriesSin_dropsPrecision_When_numberTerms_is1() {
        Assertions.assertNotEquals(
                taylorSeriesSin(Math.PI / 2, 1).setScale(4, RoundingMode.HALF_UP),
                BigDecimal.valueOf(Math.sin(Math.PI / 2)).setScale(4, RoundingMode.HALF_UP)
        );
    }

}
