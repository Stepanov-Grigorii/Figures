package com.company.lesson2;

import java.util.Comparator;

public class FigureComparator implements Comparator<ClosedFigure> {

    @Override
    public int compare(ClosedFigure f1, ClosedFigure f2) {
        if(f1 == null || f2 == null) {
            if(f1 == null && f2 == null){
                return 0;
            }else if(f1 == null){
                return -1;
            }
            return 1;
        }
        Integer comparingPriorityResult = f1.getPriority().compareTo(f2.getPriority());
        return comparingPriorityResult != 0 ? -comparingPriorityResult : -f1.getArea().compareTo(f2.getArea());
    }
}