package com.company.lesson2;

import java.util.Comparator;

public class FigureComparator implements Comparator<ClosedFigure> {

    @Override
    public int compare(ClosedFigure f1, ClosedFigure f2) {
        if(figureType(f1) - figureType(f2) == 0){
            if(f1 instanceof Polygon & f2 instanceof Polygon){
                if(((Polygon) f1).getNumberOfSides() == ((Polygon) f2).getNumberOfSides()){
                    return (int) (f2.getArea() - f1.getArea());
                }
                return ((Polygon) f1).getNumberOfSides() - ((Polygon) f2).getNumberOfSides();
            }
            if(f1 == null && f2 == null)
                return 0;
            return (int) (f2.getArea() - f1.getArea());
        }
        return figureType(f1) - figureType(f2);
    }

    public int figureType(ClosedFigure figure){
        if(figure instanceof Circle){
            return 1;
        }
        if(figure instanceof RightTriangle){
            return 3;
        }
        if(figure instanceof Triangle){
            return 2;
        }
        if(figure instanceof Square){
            return 5;
        }
        if(figure instanceof Rectangle){
            return 4;
        }
        if(figure instanceof Polygon){
            return 6;
        }
        return 0;
    }
}