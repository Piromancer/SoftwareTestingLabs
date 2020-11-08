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
        return null;
    }

    public static BigDecimal csc(double x){
        return null;
    }

    public static BigDecimal ln(double x){
        if (x == -Math.PI/3) return BigDecimal.valueOf(-1.732);
        if (x == -Math.PI/4) return BigDecimal.valueOf(-1);
        if (x == -Math.PI/6) return BigDecimal.valueOf(-0.577);
        if (x == 0) return BigDecimal.valueOf(0);
        return null;
    }

    public static BigDecimal log(double x, int base){
        if (x == -Math.PI/3) return BigDecimal.valueOf(-1.732);
        if (x == -Math.PI/4) return BigDecimal.valueOf(-1);
        if (x == -Math.PI/6) return BigDecimal.valueOf(-0.577);
        if (x == 0) return BigDecimal.valueOf(0);
        return null;
    }

}
