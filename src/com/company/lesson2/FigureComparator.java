package com.company.lesson2;

import java.util.Comparator;

public class FigureComparator implements Comparator<ClosedFigure> {

    @Override
    public int compare(ClosedFigure f1, ClosedFigure f2) {
        if(f1 == null && f2 == null)
            return 0;
        if(Priority.valueFromString(f1.getClass().getSimpleName()).getPriority() - Priority.valueFromString(f2.getClass().getSimpleName()).getPriority() == 0){
            if(f1 instanceof Polygon & f2 instanceof Polygon){
                if(((Polygon) f1).getNumberOfSides() == ((Polygon) f2).getNumberOfSides()){
                    System.out.println(f1.getClass().getSimpleName());
                    return (int) (f2.getArea() - f1.getArea());
                }
                return ((Polygon) f1).getNumberOfSides() - ((Polygon) f2).getNumberOfSides();
            }
            return (int) (f2.getArea() - f1.getArea());
        }
        return Priority.valueFromString(f1.getClass().getSimpleName()).getPriority() - Priority.valueFromString(f2.getClass().getSimpleName()).getPriority();
    }
}