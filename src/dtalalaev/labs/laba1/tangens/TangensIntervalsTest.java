package dtalalaev.labs.laba1.tangens;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TangensIntervalsTest {

    @Test
    void testCalculate_ValidIntervalsAndStep1() {
        TangensIntervals tangensIntervals = new TangensIntervals(1, 3, 1);
        tangensIntervals.calculate();
        List<Double> testResults = List.of(1.5574, -2.1850, -0.1425);
        assertResultsAreClose(testResults, tangensIntervals.getResults());
    }
    @Test
    void testCalculate_ValidIntervalsAndStep0_5() {
        TangensIntervals tangensIntervals = new TangensIntervals(-2, 2, 0.5);
        tangensIntervals.calculate();
        List<Double> testResults = List.of(2.1850, -14.1014, -1.5574, -0.5463, 0.0, 0.5463, 1.5574, 14.1014, -2.1850);
        assertResultsAreClose(testResults, tangensIntervals.getResults());
    }

    @Test
    void testCalculate_OneElement() {
        TangensIntervals tangensIntervals = new TangensIntervals(0, 0, 1);
        tangensIntervals.calculate();
        List<Double> testResults = List.of(0.0);
        assertResultsAreClose(testResults, tangensIntervals.getResults());
    }

    @Test
    void testCalculate_BigInterval() {
        TangensIntervals tangensIntervals = new TangensIntervals(-1, 1, 4);
        tangensIntervals.calculate();
        List<Double> testResults = List.of(-1.5574);
        assertResultsAreClose(testResults, tangensIntervals.getResults());
    }


    private void assertResultsAreClose(List<Double> expected, List<Double> actual) {
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i), 0.0001);
        }
    }
}