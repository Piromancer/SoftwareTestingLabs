package taskParts.part1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import taskParts.utils.ExecutionListener;

public class TestsRunner {
    public static void main(String[] args) {
        JUnitCore junitCore;
        junitCore = new JUnitCore();
        junitCore.addListener(new ExecutionListener());

        Result result = junitCore.run(PositiveTaylorSeriesTests.class, NegativeTaylorSeriesTests.class);
//
//        for (Failure failure : result.getFailures()) {
//            System.out.println(failure.toString());
//        }
//
//        if(result.wasSuccessful())
//            System.out.println("Tests ran successfully");
//        else
//            System.out.println("Tests failed");
    }
}
