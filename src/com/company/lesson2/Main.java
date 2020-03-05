package com.company.lesson2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<CFigure> closedFigures = new ArrayList<>();
        Comparator<CFigure> closedFiguresComparator = new FigureComparator();

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
                    closedFigures.sort(closedFiguresComparator);
                    System.out.println(closedFigures.toString());
                    Info.PrintInfo();
                    break;
                case "q":
                    flag = false;
                    Info.PrintBye();
                    break;
            }
        }
    }
    public static void branch(ArrayList<CFigure> closedFigures, Scanner scanner){
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
}