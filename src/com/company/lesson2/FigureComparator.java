package com.company.lesson2;

import java.util.Comparator;

public class FigureComparator implements Comparator<ClosedFigure> {

    @Override
    public int compare(ClosedFigure f1, ClosedFigure f2) {
        return figureType(f1) - figureType(f2);
    }

    public int figureType(ClosedFigure figure){
        if(figure instanceof Circle){
            return 1;
        }
        if(figure instanceof Triangle){
            return 2;
        }
        if(figure instanceof RightTriangle){
            return 3;
        }
        if(figure instanceof Rectangle){
            return 4;
        }
        if(figure instanceof Square){
            return 5;
        }
        if(figure instanceof Polygon){
            return 6;
        }
        return 0;
    }
}
