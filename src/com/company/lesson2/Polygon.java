package com.company.lesson2;

public class Polygon extends AbstractClosedFigure implements CorrectFigure{
    private int numberOfSides;
    private double length;
    final int[] arr;


    public Polygon(int numberOfSides, int length) {
        arr = new int[10];
        this.numberOfSides = numberOfSides;
        this.length = length;
    }

    @Override
    public double getRadiusOfInscribedCircle() {
        int i = 0;
        return length / 2 / Math.tan(Math.PI / numberOfSides);
    }

    @Override
    public double getRadiusOfCircumscribedCircle() {
        return length / 2 / Math.sin(Math.PI / numberOfSides);
    }

    @Override
    public Double getArea() {
        return numberOfSides * Math.pow(length, 2) / (4 * Math.tan(Math.PI / numberOfSides));
    }

    @Override
    public Double getPerimeter() {
        return numberOfSides * length;
    }

    @Override
    public Double getPriority() {
        return (double) getNumberOfSides();
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

    public Double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
