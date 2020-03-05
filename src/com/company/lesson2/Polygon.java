package com.company.lesson2;

public class Polygon extends CFigure implements CorrectFigure{
    private int numberOfSides;
    private double length;

    public Polygon(int numberOfSides, int length) {
        this.numberOfSides = numberOfSides;
        this.length = length;
    }

    @Override
    public double getRadiusOfInscribedCircle() {
        return length / 2 / Math.tan(Math.PI / numberOfSides);
    }

    @Override
    public double getRadiusOfCircumscribedCircle() {
        return length / 2 / Math.sin(Math.PI / numberOfSides);
    }

    @Override
    public double getArea() {
        return numberOfSides * Math.pow(length, 2) / (4 * Math.tan(Math.PI / numberOfSides));
    }

    @Override
    public double getPerimeter() {
        return numberOfSides * length;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "numberOfSides=" + numberOfSides +
                ", length=" + length +
                '}';
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getPriority() {
        return getNumberOfSides();
    }
}
