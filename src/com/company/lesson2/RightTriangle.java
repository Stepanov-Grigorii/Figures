package com.company.lesson2;

public class RightTriangle extends Triangle {
    public RightTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "a=" + getA() +
                ", b=" + getB() +
                ", c=" + getC() +
                '}';
    }
}
