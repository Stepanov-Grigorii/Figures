package com.company.lesson2;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<ClosedFigure> closedFigures = new ArrayList<>();
        Comparator<ClosedFigure> closedFiguresComparator = new FigureComparator();

        Comparator<ClosedFigure> staticComparator = Comparator
                .nullsFirst(Comparator.comparing(ClosedFigure::getPriority).thenComparing(ClosedFigure::getArea));
        Comparator<ClosedFigure> staticComparator2 = Comparator
                .nullsFirst(Comparator.comparing(ClosedFigure::getPriority).thenComparing(ClosedFigure::getArea).reversed());

        closedFigures.add(null);

        Info.PrintInfo();
        while(flag) {
            switch (scanner.nextLine()) {
                case "r":
                    Info.PrintMessage();
                    try {
                        closedFigures.add(ClosedFigureFactory.createRectangle());
                        branch(closedFigures, scanner);
                    }catch (FiguresException e){
                        System.out.println(e.getMessage());
                        Info.PrintInfo();
                    }
                    break;
                case "c":
                    Info.PrintMessage();
                    try {
                        closedFigures.add(ClosedFigureFactory.createCircle());
                        branch(closedFigures, scanner);
                    }catch (FiguresException e){
                        System.out.println(e.getMessage());
                        Info.PrintInfo();
                    }
                    break;
                case "t":
                    Info.PrintMessage();
                    closedFigures.add(null);
                    try {
                        closedFigures.add(ClosedFigureFactory.createTriangle());
                        branch(closedFigures, scanner);
                    }catch (FiguresException e){
                        System.out.println(e.getMessage());
                        Info.PrintInfo();
                    }
                    break;
                case "p":
                    Info.PrintMessage();
                    try {
                        closedFigures.add(ClosedFigureFactory.createPolygon());
                        branch(closedFigures, scanner);
                    }catch (FiguresException e){
                        System.out.println(e.getMessage());
                        Info.PrintInfo();
                    }
                    break;
                case "pr":
                    closedFigures.sort(staticComparator2);
                    System.out.println(closedFigures.toString());
                    Info.PrintInfo();
                    break;
                case "ir":
                    printRadiusIncCircle(closedFigures.stream().filter(c -> c instanceof CircInsFigure)
                            .map(c -> (CircInsFigure) c)
                            .collect(Collectors.toList()));
                    Info.PrintInfo();
                    break;
                case "ta":
                    printTriangleArea(closedFigures.stream().filter(c -> c instanceof Triangle)
                            .map(c -> (Triangle) c)
                            .collect(Collectors.toList()));
                    Info.PrintInfo();
                    break;
                case "cln":
                    printCorrectFigure(closedFigures.stream().filter(c -> c instanceof CorrectFigure)
                            .map(c -> (CorrectFigure) c)
                            .collect(Collectors.toList()));
                    Info.PrintInfo();
                    break;
                case "q":
                    flag = false;
                    Info.PrintBye();
                    break;
            }
        }
    }
    public static void branch(ArrayList<ClosedFigure> closedFigures, Scanner scanner){
        boolean flag = true;
        System.out.println("closedFigure = " + closedFigures.get(closedFigures.size() - 1));
        if(closedFigures.get(closedFigures.size() - 1) instanceof CircInsFigure) {
            Info.PrintCorrectDetails();
            while (flag) {
                switch (scanner.nextLine()) {
                    case "p":
                        System.out.println(closedFigures.get(closedFigures.size() - 1).getPerimeter());
                        Info.PrintCorrectDetails();
                        break;
                    case "a":
                        System.out.println(closedFigures.get(closedFigures.size() - 1).getArea());
                        Info.PrintCorrectDetails();
                        break;
                    case "i":
                        System.out.println(((CircInsFigure) closedFigures.get(closedFigures.size() - 1)).getRadiusOfInscribedCircle());
                        Info.PrintCorrectDetails();
                        break;
                    case "c":
                        System.out.println(((CircInsFigure) closedFigures.get(closedFigures.size() - 1)).getRadiusOfCircumscribedCircle());
                        Info.PrintCorrectDetails();
                        break;
                    case "q":
                        flag = false;
                        Info.PrintInfo();
                        break;
                }
            }
        }else{
            Info.PrintDetails();
            while(flag)
            switch (scanner.nextLine()){
                case "p":
                    System.out.println(closedFigures.get(closedFigures.size() - 1).getPerimeter());
                    Info.PrintDetails();
                    break;
                case "a":
                    System.out.println(closedFigures.get(closedFigures.size() - 1).getArea());
                    Info.PrintDetails();
                    break;
                case "q":
                    flag = false;
                    Info.PrintInfo();
                    break;
            }
        }
    }
    public static void printRadiusIncCircle(List<? extends CircInsFigure> figures){
        System.out.println("Inscribed circles radius\n");
        figures.forEach(f -> System.out.println(f.toString() + " radius = "
                        + f.getRadiusOfInscribedCircle()));
    }
    public static void printTriangleArea(List<? extends Triangle> figures){
        System.out.println("Triangles areas\n");
        figures.forEach(f -> System.out.println(f.toString() + " area = "
                + f.getArea()));
    }
    public static void printCorrectFigure(List<? extends CorrectFigure> figures){
        System.out.println("Correct figures information\n");
        figures.forEach(f -> System.out.println(f.toString()
                + " length = " + f.getLength()
                + " number of sides = " + f.getNumberOfSides()));
    }
}