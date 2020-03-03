package com.company.lesson2;

import java.util.Comparator;

public class FigureAreaComparator implements Comparator<ClosedFigure> {

    @Override
    public int compare(ClosedFigure f1, ClosedFigure f2) {
        return (int) (f1.getArea() - f2.getArea());
    }
}
