package com.company.lesson2;

public class Square extends Rectangle implements CorrectFigure{
    public Square(int length) {
        super(length, length);
    }

    @Override
    public double getRadiusOfInscribedCircle() {
        return getLength() / 2;
    }

    @Override
    public double getRadiusOfCircumscribedCircle() {
        return getLength() * Math.sqrt(2);
    }

    @Override
    public String toString(){
        return "Square{" +
                "length=" + getLength() +
                '}';
    }
}