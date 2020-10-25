package taskParts.part1;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 1. Функция sin(x)
 */

public class SinusModule {

    private static BigInteger factorial(long n){
        if(n < 0) return BigInteger.valueOf(1);
        BigInteger fac = BigInteger.valueOf(1);
        for (long i = 2; i <= n; i++)
            fac = fac.multiply(BigInteger.valueOf(i));
        return fac;
    }

    public static BigDecimal taylorSeriesSin(double x, int termsNumber) throws ArithmeticException{
        if(termsNumber <= 0) throw new ArithmeticException("Non-positive number of terms: " + termsNumber);
        x = x % (2 * Math.PI);
        BigDecimal result = BigDecimal.valueOf(x);
        for(int i = 1; i < termsNumber; i++){
            result = result.add(
                    BigDecimal.valueOf(Math.pow(-1, i))
                            .multiply(BigDecimal.valueOf(x).pow(2*i+1))
                            .divide(new BigDecimal(factorial(2*i+1)), 5, RoundingMode.HALF_UP)
            );
        }
        return result;
    }

}
