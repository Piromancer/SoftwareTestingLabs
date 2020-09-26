package taskParts.part3;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import taskParts.part1.NegativeTaylorSeriesTests;
import taskParts.part1.PositiveTaylorSeriesTests;
import taskParts.utils.ExecutionListener;

public class TestsRunner {
    public static void main(String[] args) {
        JUnitCore junitCore;
        junitCore = new JUnitCore();
        junitCore.addListener(new ExecutionListener());

        Result result = junitCore.run(CivilizationTests.class, PersonTests.class);
    }
}
