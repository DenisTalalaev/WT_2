package dtalalaev.labs.laba1.bucket;

import java.util.ArrayList;

public class Bucket {
    private ArrayList<Ball> balls = new ArrayList<>();

    public void addBall(Ball... balls) {
        for (Ball ball: balls
             ) {
            this.balls.add(ball);
        }
    }

    public double calculateWeight(){
        double counter = 0;
        for (Ball ball: balls
             ) {
            counter += ball.getWeight();
        }
        return counter;
    }

    public int countColorizedBall(Color color) {
        int counter = 0;
        for (Ball ball: balls
             ) {
            if(ball.getColor().equals(color)) {
                counter++;
            }
        }
        return counter;
    }

}
