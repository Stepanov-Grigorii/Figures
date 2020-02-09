package com.company.lesson2;

public class RightTriangle extends Triangle implements CorrectFigure {
    public RightTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public double getRadiusOfInscribedCircle() {
        return Math.sqrt(((getPerimeter()/2 - getA()) * (getPerimeter()/2 - getB()) * (getPerimeter()/2 - getC())) / getPerimeter() / 2);
    }

    @Override
    public double getRadiusOfCircumscribedCircle() {
        return Math.sqrt(Math.pow(getB(), 2) + Math.pow(getC(), 2)) / 2;
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
