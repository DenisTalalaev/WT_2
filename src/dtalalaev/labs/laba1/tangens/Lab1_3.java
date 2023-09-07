package dtalalaev.labs.laba1.tangens;

import java.util.Scanner;

public class Lab1_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, h;
        System.out.println("Enter left border");
        a = scanner.nextDouble();
        System.out.println("Enter right border");
        b = scanner.nextDouble();
        System.out.println("Enter step");
        h = scanner.nextDouble();

        scanner.close();

        TangensIntervals tangensIntervals = new TangensIntervals(a, b, h);
        tangensIntervals.calculate();
        System.out.println(tangensIntervals.getTable());
    }

}
