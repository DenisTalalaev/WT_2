package dtalalaev.labs.laba1.tangens;

import java.util.ArrayList;

public class TangensIntervals {
    private double a;
    private double b;
    private double h;
    private ArrayList<Double> results;

    public ArrayList<Double> getResults() {
        return results;
    }

    public TangensIntervals(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public void calculate() {
        if (results == null) {
            results = new ArrayList<>();
        }
        ;
        while (b + h / 2.0 > a + results.size() * h) {
            results.add(Math.tan(h * results.size() + a));
        }
    }

    public String getTable() {
        StringBuilder sb = new StringBuilder();
        String formatHeader = "| %-15s | %-15s |\n";
        String formatRow = "| %-15.5f | %-15.5f |\n";

        sb.append("_____________________________________\n");
        sb.append(String.format(formatHeader, "param", "tg(param)"));

        for (int i = 0; i < results.size(); i++) {
            sb.append("_____________________________________\n");
            sb.append(String.format(formatRow, a + h * i, results.get(i)));
        }
        sb.append("_____________________________________\n");

        return sb.toString();
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
