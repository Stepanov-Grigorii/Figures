package com.company.lesson2;

import java.util.Comparator;

public class FigureComparator implements Comparator<CFigure> {

    @Override
    public int compare(CFigure f1, CFigure f2) {
        if(f1 == null | f2 == null) {
            if(f1 == null & f2 == null){
                return 0;
            }else if(f1 == null){
                return -1;
            }
            return 1;
        }
        Integer comparingPriorityResult = f1.compareTo(f2);
        return comparingPriorityResult != 0 ? comparingPriorityResult : f1.compareTo(f2.getArea());
    }
}
//Integer comparingPriorityResult = f1.getPriority().compareTo(f2.getPriority());                       ??f1.getPriority().compareTo??
//return comparingPriorityResult != 0 ? comparingPriorityResult : f1.getArea().compareTo(f2.getArea()); ??f1.getArea().compareTo??