package dtalalaev.labs.laba1.tangens;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TangensIntervalsTest {

    @Test
    void calculateTest_1() {
        TangensIntervals tangensIntervals = new TangensIntervals(1, 3, 1);
        tangensIntervals.calculate();
        List<Double> testResults = List.of(1.5574, -2.1850, -0.1425);
        assertResultsAreClose(testResults, tangensIntervals.getResults());
    }
    @Test
    void calculateTest_2() {
        TangensIntervals tangensIntervals = new TangensIntervals(-2, 2, 0.5);
        tangensIntervals.calculate();
        List<Double> testResults = List.of(2.1850, -14.1014, -1.5574, -0.5463, 0.0, 0.5463, 1.5574, 14.1014, -2.1850);
        assertResultsAreClose(testResults, tangensIntervals.getResults());
    }

    @Test
    void calculateTest_3() {
        TangensIntervals tangensIntervals = new TangensIntervals(0, 0, 1);
        tangensIntervals.calculate();
        List<Double> testResults = List.of(0.0);
        assertResultsAreClose(testResults, tangensIntervals.getResults());
    }

    @Test
    void calculateTest_4() {
        TangensIntervals tangensIntervals = new TangensIntervals(-1, 1, 4);
        tangensIntervals.calculate();
        List<Double> testResults = List.of(-1.5574);
        assertResultsAreClose(testResults, tangensIntervals.getResults());
    }

    @Test
    void calculateTest_5() {
        TangensIntervals tangensIntervals = new TangensIntervals(0.5, 1.5, 0.2);
        tangensIntervals.calculate();
        List<Double> testResults = List.of(0.5463, 0.8422, 1.2601, 1.9647, 3.6021, 14.1014);
        assertResultsAreClose(testResults, tangensIntervals.getResults());
    }

    private void assertResultsAreClose(List<Double> expected, List<Double> actual) {
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i), 0.0001);
        }
    }
}