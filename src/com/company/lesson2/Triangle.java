package com.company.lesson2;


public class Triangle implements CircInsFigure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getRadiusOfInscribedCircle() {
        return Math.sqrt(((getPerimeter()/2 - a) * (getPerimeter()/2 - b) * (getPerimeter()/2 - c)) / getPerimeter() / 2);
    }

    @Override
    public double getRadiusOfCircumscribedCircle() {
        return a * b * c / (4 * Math.sqrt(getPerimeter() / 2 * (getPerimeter() / 2 - a) * (getPerimeter() / 2 - b) * (getPerimeter() / 2 - c)));
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}