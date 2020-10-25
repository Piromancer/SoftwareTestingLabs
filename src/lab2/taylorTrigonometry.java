package lab2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class taylorTrigonometry {

    private static BigInteger factorial(long n){
        if(n < 0) return BigInteger.valueOf(1);
        BigInteger fac = BigInteger.valueOf(1);
        for (long i = 2; i <= n; i++)
            fac = fac.multiply(BigInteger.valueOf(i));
        return fac;
    }

    public static BigDecimal sin(double x, int precision){
        //if(termsNumber <= 0) throw new ArithmeticException("Non-positive number of terms: " + termsNumber);
        x = x % (2 * Math.PI);
        BigDecimal result = BigDecimal.valueOf(x);
        for(int i = 1; i < 10 /* turn into check precision */; i++){
            result = result.add(
                    BigDecimal.valueOf(Math.pow(-1, i))
                            .multiply(BigDecimal.valueOf(x).pow(2*i+1))
                            .divide(new BigDecimal(factorial(2*i+1)), 4, RoundingMode.HALF_UP)
            );
        }
        return result;
    }

    public static BigDecimal cos(double x, int precision){
        return sin(Math.PI/2 - x, precision);
    }

    public static BigDecimal csc(double x, int precision){
        if(x % Math.PI == 0) throw new ArithmeticException("Out of function scope");
        return BigDecimal.valueOf(1).divide(sin(x, precision), 4, RoundingMode.HALF_UP);
    }

    public static BigDecimal tan(double x, int precision){
        if((x - Math.PI / 2) % Math.PI == 0) throw new ArithmeticException("Out of function scope");
        return sin(x, precision).divide(cos (x, precision), 4, RoundingMode.HALF_UP);
    }

    public static BigDecimal ctg(double x, int precision){
        if(x % Math.PI == 0) throw new ArithmeticException("Out of function scope");
        return cos(x, precision).divide(sin (x, precision), 4, RoundingMode.HALF_UP);
    }

    public static BigDecimal sin(double x){
        //if(termsNumber <= 0) throw new ArithmeticException("Non-positive number of terms: " + termsNumber);
        return sin(x, 4);
    }

    public static BigDecimal cos(double x){
        return sin(Math.PI/2 - x, 4);
    }

    public static BigDecimal csc(double x){
        if(x % Math.PI == 0) throw new ArithmeticException("Out of function scope");
        return BigDecimal.valueOf(1).divide(sin(x, 4), 4, RoundingMode.HALF_UP);
    }

    public static BigDecimal tan(double x){
        if((x - Math.PI/2) % Math.PI == 0) throw new ArithmeticException("Out of function scope");
        return sin(x).divide(cos(x, 4), 4, RoundingMode.HALF_UP);
    }

    public static BigDecimal ctg(double x){
        if(x % Math.PI == 0) throw new ArithmeticException("Out of function scope");
        return cos(x).divide(sin(x, 4), 4, RoundingMode.HALF_UP);
    }

    public static BigDecimal ln(double x, int precision){
        if(x <= 0) throw new ArithmeticException("Logarithm can't accept non-positive values");
        BigDecimal result = new BigDecimal(x);
        for (int i = 2; i < 10; i++) {
            result.add(
                    BigDecimal.valueOf(
                            Math.pow(-1, i+1) * Math.pow(x-1, i)
                    )
            );
        }
        return result;
    }

    public static BigDecimal log(double x, int base, int precision){
        return ln(x, precision).divide(ln(base, precision), 4, RoundingMode.HALF_UP);
    }

    public static BigDecimal ln(double x){
        return ln(x,4);
    }

    public static BigDecimal log(double x, int base){
        return ln(x, 4).divide(ln(base, 4), 4, RoundingMode.HALF_UP);
    }

}
