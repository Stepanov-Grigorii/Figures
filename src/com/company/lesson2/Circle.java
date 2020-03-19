package com.company.lesson2;

public class Circle extends AbstractClosedFigure {
    private int radius;

    @Override
    public Double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public Double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public Double getPriority() {
        return 1.0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
