package com.company.lesson2;

public class Polygon implements ClosedFigure{
    private int numberOfSides;
    private int length;

    public Polygon(int numberOfSides, int length) {
        this.numberOfSides = numberOfSides;
        this.length = length;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
