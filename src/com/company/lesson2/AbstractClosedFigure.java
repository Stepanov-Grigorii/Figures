package com.company.lesson2;

import java.util.TreeMap;

public abstract class AbstractClosedFigure implements ClosedFigure {

    static final TreeMap<String, Integer> grammar = new TreeMap<>();
    @Override
    public int compareTo(ClosedFigure figure){
        return this.getPriority().compareTo(figure.getPriority()) !=0 ? this.getPriority().compareTo(figure.getPriority()) :
                this.getArea().compareTo(figure.getArea());
    }
}
