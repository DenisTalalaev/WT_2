package dtalalaev.labs.laba1.bucket;

public class Lab1_9 {


    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        for (int i = 0; i < 10; i++) {
            bucket.addBall(new Ball(Color.BLUE, i * 10.0 + 5.0));
        }
        for (int i = 0; i < 15; i++) {
            bucket.addBall(new Ball(Color.YELLOW, i * 8.0 + 2.0));
        }
        for (int i = 0; i < 10; i++) {
            bucket.addBall(new Ball(Color.PURPLE, i * 3.0 + 7.0));
        }
        for (int i = 0; i < 15; i++) {
            bucket.addBall(new Ball(Color.RED, i * 1.5 + 1.0));
        }
        System.out.println(bucket.calculateWeight() + " - Weight");
        System.out.println(bucket.countColorizedBall(Color.BLUE) + " - Blue balls");
    }
}
