package com.company.lesson2;

public abstract class CFigure implements ClosedFigure {
    public abstract double getPriority();

    @Override
    public int compareTo(CFigure figure){
        return (int) (2 * (this.getPriority() - figure.getPriority()));
    }

    public int compareTo(double area){
        return (int) (2 * (this.getArea() - area));
    }
}
