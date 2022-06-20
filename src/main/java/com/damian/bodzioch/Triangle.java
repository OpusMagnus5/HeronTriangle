package com.damian.bodzioch;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double field;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.sideA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        this.sideB = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3- y2, 2));
        this.sideC = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double s = (sideA + sideB + sideC) / 2;
        this.field = Math.sqrt(s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC));
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getField() {
        return field;
    }
}
