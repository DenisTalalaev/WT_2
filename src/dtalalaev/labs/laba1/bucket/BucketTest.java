package dtalalaev.labs.laba1.bucket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BucketTest {

    private Bucket bucket;

    @BeforeEach
    void setUp() {
        bucket = fillBucket(10, 15, 10, 15);
    }

    private Bucket fillBucket(int blueCount, int yellowCount, int purpleCount, int redCount) {
        Bucket bucket = new Bucket();
        for (int i = 0; i < blueCount; i++) {
            bucket.addBall(new Ball(Color.BLUE, i * 10.0 + 5.0));
        }
        for (int i = 0; i < yellowCount; i++) {
            bucket.addBall(new Ball(Color.YELLOW, i * 8.0 + 2.0));
        }
        for (int i = 0; i < purpleCount; i++) {
            bucket.addBall(new Ball(Color.PURPLE, i * 3.0));
        }
        for (int i = 0; i < redCount; i++) {
            bucket.addBall(new Ball(Color.RED, i * 1.5 + 1.0));
        }
        return bucket;
    }

    @Test
    void testCalculateWeight() {
        double expectedWeight = (5 + 15 + 25 + 35 + 45 + 55 + 65 + 75 + 85 + 95) // blue
                + (2 + 10 + 18 + 26 + 34 + 42 + 50 + 58 + 66 + 74 + 82 + 90 + 98 + 106 + 114) // Желтые мячи
                + (0 + 3 + 6 + 9 + 12 + 15 + 18 + 21 + 24 + 27) // Фиолетовые мячи
                + (1 + 2.5 + 4 + 5.5 + 7 + 8.5 + 10 + 11.5 + 13 + 14.5 + 16 + 17.5 + 19 + 20.5 + 22); // Красные мячи

        double calculatedWeight = bucket.calculateWeight();

        assertEquals(expectedWeight, calculatedWeight, 0.001);
    }
    @Test
    void testCountColorizedBall_Blue() {
        int blueCount = bucket.countColorizedBall(Color.BLUE);
        assertEquals(10, blueCount);
    }

    @Test
    void testCountColorizedBall_Yellow() {
        int yellowCount = bucket.countColorizedBall(Color.YELLOW);
        assertEquals(15, yellowCount);
    }

    @Test
    void testCountColorizedBall_Purple() {
        int purpleCount = bucket.countColorizedBall(Color.PURPLE);
        assertEquals(10, purpleCount);
    }

    @Test
    void testCountColorizedBall_Red() {
        int redCount = bucket.countColorizedBall(Color.RED);
        assertEquals(15, redCount);
    }

    @Test
    void testCountColorizedBall_NonExistentColor() {
        int nonExistentCount = bucket.countColorizedBall(Color.GREEN);
        assertEquals(0, nonExistentCount);
    }
}