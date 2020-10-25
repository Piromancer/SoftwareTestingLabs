package lab2;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static lab2.taylorTrigonometry.*;

// x <= 0 : (((((tan(x) * csc(x)) + csc(x)) ^ 3) + ((sin(x) - cot(x)) ^ 3)) * ((sin(x) + tan(x)) / sin(x)))
// x > 0 : (((((log_2(x) + log_3(x)) + log_2(x)) ^ 3) - ((ln(x) - log_10(x)) * log_5(x))) + (((log_10(x) - log_2(x)) ^ 3)
//          * (((log_3(x) * log_5(x)) / log_10(x)) / log_3(x))))

public class scarySystemSolver {

    public static BigDecimal solveSystem(double x){
        if (x <= 0) {
            return tan(x).multiply(csc(x)).add(csc(x).pow(3)).add(
                    sin(x).subtract(ctg(x)).pow(3).multiply(
                            sin(x).add(tan(x)).divide(sin(x), 4, RoundingMode.HALF_UP)
                    )
            ).setScale(4, RoundingMode.HALF_UP);
        } else {
            return new BigDecimal(2);
        }
    }

}
