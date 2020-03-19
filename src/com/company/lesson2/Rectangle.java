package com.company.lesson2;

public class Rectangle extends AbstractClosedFigure {
    private Double width;
    private Double length;


    public Rectangle(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public Double getArea() {
        return (double) width * length;
    }

    @Override
    public Double getPerimeter() {
        return 2. * (width + length);
    }

    @Override
    public Double getPriority() {
        return 4.0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
}
