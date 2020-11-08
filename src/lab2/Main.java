package lab2;
import static lab2.TaylorTrigonometry.*;
import static lab2.ScarySystemSolver.*;

public class Main {

    public static void main(String[] args){
        for(double i = -15; i <= 15; i += 0.01){
            if (i == 0 || i == 0.9999999999997252) continue;
            CSV_Logger.log(
                    "C:\\Users\\DVR_ITMO\\Desktop\\SoftwareTestingLab1\\csv\\sin.csv",
                    i,
                    sin(i)
            );
            CSV_Logger.log(
                    "C:\\Users\\DVR_ITMO\\Desktop\\SoftwareTestingLab1\\csv\\cos.csv",
                    i,
                    cos(i)
            );
            CSV_Logger.log(
                    "C:\\Users\\DVR_ITMO\\Desktop\\SoftwareTestingLab1\\csv\\tan.csv",
                    i,
                    tan(i)
            );
            CSV_Logger.log(
                    "C:\\Users\\DVR_ITMO\\Desktop\\SoftwareTestingLab1\\csv\\ctg.csv",
                    i,
                    ctg(i)
            );
            CSV_Logger.log(
                    "C:\\Users\\DVR_ITMO\\Desktop\\SoftwareTestingLab1\\csv\\csc.csv",
                    i,
                    csc(i)
            );
            if(i > 0)
                CSV_Logger.log(
                        "C:\\Users\\DVR_ITMO\\Desktop\\SoftwareTestingLab1\\csv\\ln.csv",
                        i,
                        ln(i)
                );
            try {
                CSV_Logger.log(
                        "C:\\Users\\DVR_ITMO\\Desktop\\SoftwareTestingLab1\\csv\\system.csv",
                        i,
                        solveSystem(i)
                );
            } catch (Exception e){
                System.out.println(i);
            }
        }
    }

}
