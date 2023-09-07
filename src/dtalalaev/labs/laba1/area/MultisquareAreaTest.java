package dtalalaev.labs.laba1.area;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MultisquareAreaTest {

    Area testArea = new MultisquareArea(
            new SquareArea(new Dot(-4, 5), new Dot(4, 0)),
            new SquareArea(new Dot(-6, 0), new Dot(6, -3))
    );

    @Test
    void testDotInArea_InArea_1() {
        double x = 1;
        double y = 1;
        boolean answer = true;
        assertEquals(testArea.isDotInArea(new Dot(x, y)), answer);
    }

    @Test
    void testDotInArea_InArea_2() {
        double x = 1.5;
        double y = 1.5;
        boolean answer = true;
        assertEquals(testArea.isDotInArea(new Dot(x, y)), answer);
    }

    @Test
    void testDotInArea_NotInArea_1() {
        double x = 7;
        double y = 1.5;
        boolean answer = false;
        assertEquals(testArea.isDotInArea(new Dot(x, y)), answer);
    }

    @Test
    void testDotInArea_InArea_3() {
        double x = 0;
        double y = 0;
        boolean answer = true;
        assertEquals(testArea.isDotInArea(new Dot(x, y)), answer);
    }

    @Test
    void testDotInArea_InArea_4() {
        double x = 6;
        double y = 0;
        boolean answer = true;
        assertEquals(testArea.isDotInArea(new Dot(x, y)), answer);
    }

    @Test
    void testDotInArea_NotInArea_2() {
        double x = 0;
        double y = 5.001;
        boolean answer = false;
        assertEquals(testArea.isDotInArea(new Dot(x, y)), answer);
    }
    @Test
    void testDotInArea_InArea_5() {
        double x = -3.5;
        double y = 4.5;
        boolean answer = true;
        assertEquals(testArea.isDotInArea(new Dot(x, y)), answer);
    }

    @Test
    void testDotInArea_NotInArea_3() {
        double x = -7;
        double y = 0;
        boolean answer = false;
        assertEquals(testArea.isDotInArea(new Dot(x, y)), answer);
    }

    @Test
    void testDotInArea_InArea_6() {
        double x = 5;
        double y = -1.5;
        boolean answer = true;
        assertEquals(testArea.isDotInArea(new Dot(x, y)), answer);
    }

    @Test
    void testDotInArea_InArea_7() {
        double x = 3.999;
        double y = 0;
        boolean answer = true;
        assertEquals(testArea.isDotInArea(new Dot(x, y)), answer);
    }

    @Test
    void testDotInArea_NotInArea_4() {
        double x = -1;
        double y = -4;
        boolean answer = false;
        assertEquals(testArea.isDotInArea(new Dot(x, y)), answer);
    }

    @Test
    void testDotInArea_NotInArea_5() {
        double x = -6;
        double y = -3.001;
        boolean answer = false;
        assertEquals(testArea.isDotInArea(new Dot(x, y)), answer);
    }

    @Test
    void testDotInArea_NotInArea_6() {
        double x = 6.001;
        double y = -3;
        boolean answer = false;
        assertEquals(testArea.isDotInArea(new Dot(x, y)), answer);
    }


}