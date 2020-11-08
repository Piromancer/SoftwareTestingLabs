package lab2;

import java.math.BigDecimal;

public class MockExamples {

    public static BigDecimal sin(double x){
        if (x == -Math.PI/2) return BigDecimal.valueOf(-1);
        if (x == -Math.PI/3) return BigDecimal.valueOf(-0.866);
        if (x == -Math.PI/4) return BigDecimal.valueOf(-0.707);
        if (x == -Math.PI/6) return BigDecimal.valueOf(-0.5);
        if (x == 0) return BigDecimal.valueOf(0);
        return null;
    }

    public static BigDecimal cos(double x){
        if (x == -Math.PI/2) return BigDecimal.valueOf(0);
        if (x == -Math.PI/3) return BigDecimal.valueOf(1/2);
        if (x == -Math.PI/4) return BigDecimal.valueOf(0.707);
        if (x == -Math.PI/6) return BigDecimal.valueOf(0.866);
        if (x == 0) return BigDecimal.valueOf(1);
        return null;
    }

    public static BigDecimal tan(double x){
        if (x == -Math.PI/3) return BigDecimal.valueOf(-1.732);
        if (x == -Math.PI/4) return BigDecimal.valueOf(-1);
        if (x == -Math.PI/6) return BigDecimal.valueOf(-0.577);
        if (x == 0) return BigDecimal.valueOf(0);
        return null;
    }

    public static BigDecimal ctg(double x){
        if (x == -Math.PI/3) return BigDecimal.valueOf(-0.577);
        if (x == -Math.PI/4) return BigDecimal.valueOf(-1);
        if (x == -Math.PI/6) return BigDecimal.valueOf(-1.732);
        if (x == -Math.PI/2) return BigDecimal.valueOf(0);
        return null;
    }

    public static BigDecimal csc(double x){
        if (x == -Math.PI/3) return BigDecimal.valueOf(-1.154);
        if (x == -Math.PI/4) return BigDecimal.valueOf(-1.4);
        if (x == -Math.PI/6) return BigDecimal.valueOf(-2);
        if (x == 0) return BigDecimal.valueOf(1);
        return null;
    }

    public static BigDecimal ln(double x){
        if (x == 1) return BigDecimal.valueOf(0);
        if (x == Math.E) return BigDecimal.valueOf(1);
        if (x == 4) return BigDecimal.valueOf(1.386);
        return null;
    }

    public static BigDecimal log(double x, int base){
        if (x == 1) return BigDecimal.valueOf(0);
        if (x == 4 && base == 2) return BigDecimal.valueOf(2);
        if (x == 27 && base == 3) return BigDecimal.valueOf(3);
        return null;
    }

}
