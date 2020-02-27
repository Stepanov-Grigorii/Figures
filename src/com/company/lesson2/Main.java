package com.company.lesson2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FiguresException {
        Info info = new Info();
        int flag = 1;
        Scanner scanner = new Scanner(System.in);
        ArrayList<ClosedFigure> closedFigures = new ArrayList<>();

        while(flag == 1) {
            switch (scanner.nextLine()) {
                case "r":
                    info.PrintMessage();
                    try {
                        closedFigures.add(ClosedFigureFactory.createRectangle());
                        branch(closedFigures, info, scanner);
                    }catch (FiguresException e){
                        System.out.println(e.getMessage());
                        info.PrintInfo();
                    }
                    break;
                case "c":
                    info.PrintMessage();
                    try {
                        closedFigures.add(ClosedFigureFactory.createCircle());
                        branch(closedFigures, info, scanner);
                    }catch (FiguresException e){
                        System.out.println(e.getMessage());
                        info.PrintInfo();
                    }
                    break;
                case "t":
                    info.PrintMessage();
                    try {
                        closedFigures.add(ClosedFigureFactory.createTriangle());
                        branch(closedFigures, info, scanner);
                    }catch (FiguresException e){
                        System.out.println(e.getMessage());
                        info.PrintInfo();
                    }
                    break;
                case "p":
                    info.PrintMessage();
                    try {
                        closedFigures.add(ClosedFigureFactory.createPolygon());
                        branch(closedFigures, info, scanner);
                    }catch (FiguresException e){
                        System.out.println(e.getMessage());
                        info.PrintInfo();
                    }
                    break;
                case "q":
                    flag = 0;
                    info.PrintBye();
                    break;
            }
        }

        /*closedFigures.add(ClosedFigureFactory.createCircle());
        closedFigures.add(ClosedFigureFactory.createTriangle());
        closedFigures.add(ClosedFigureFactory.createRectangle());
        closedFigures.add(ClosedFigureFactory.createPolygon());

        for (ClosedFigure closedFigure : closedFigures) {
            System.out.println("closedFigure = " + closedFigure);
            System.out.println(closedFigure.getPerimeter());
            System.out.println(closedFigure.getArea());
            if(closedFigure instanceof CorrectFigure){
                System.out.println("Radius Of Circumscribed Circle " + ((CorrectFigure) closedFigure).getRadiusOfCircumscribedCircle());
                System.out.println("Radius Of Inscribed Circle " + ((CorrectFigure) closedFigure).getRadiusOfInscribedCircle());
            }
        }*/
    }
    public static void branch(ArrayList<ClosedFigure> closedFigures, Info info, Scanner scanner){
        int flag = 1;
        System.out.println("closedFigure = " + closedFigures.get(closedFigures.size() - 1));
        if(closedFigures.get(closedFigures.size() - 1) instanceof CircInsFigure) {
            info.PrintCorrectDetails();
            while (flag == 1) {
                switch (scanner.nextLine()) {
                    case "p":
                        System.out.println(closedFigures.get(closedFigures.size() - 1).getPerimeter());
                        info.PrintCorrectDetails();
                        break;
                    case "a":
                        System.out.println(closedFigures.get(closedFigures.size() - 1).getArea());
                        info.PrintCorrectDetails();
                        break;
                    case "i":
                        System.out.println(((CircInsFigure) closedFigures.get(closedFigures.size() - 1)).getRadiusOfInscribedCircle());
                        info.PrintCorrectDetails();
                        break;
                    case "c":
                        System.out.println(((CircInsFigure) closedFigures.get(closedFigures.size() - 1)).getRadiusOfCircumscribedCircle());
                        info.PrintCorrectDetails();
                        break;
                    case "q":
                        flag = 0;
                        info.PrintInfo();
                        break;
                }
            }
        }else{
            info.PrintDetails();
            while(flag == 1)
            switch (scanner.nextLine()){
                case "p":
                    System.out.println(closedFigures.get(closedFigures.size() - 1).getPerimeter());
                    info.PrintDetails();
                    break;
                case "a":
                    System.out.println(closedFigures.get(closedFigures.size() - 1).getArea());
                    info.PrintDetails();
                    break;
                case "q":
                    flag = 0;
                    info.PrintInfo();
                    break;
            }
        }
    }
}