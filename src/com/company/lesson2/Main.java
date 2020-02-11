package com.company.lesson2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Info info = new Info();
        int i = 0;
        int flag = 1;
        Scanner scanner = new Scanner(System.in);
        ArrayList<ClosedFigure> closedFigures = new ArrayList<>();

        while(flag == 1) {
            switch (scanner.nextLine()) {
                case "r":
                    info.PrintMessage();
                    closedFigures.add(ClosedFigureFactory.createRectangle());
                    branch(closedFigures, i, info, scanner);
                    ++i;
                    break;
                case "c":
                    info.PrintMessage();
                    closedFigures.add(ClosedFigureFactory.createCircle());
                    branch(closedFigures, i, info, scanner);
                    ++i;
                    break;
                case "t":
                    info.PrintMessage();
                    closedFigures.add(ClosedFigureFactory.createTriangle());
                    if(closedFigures.get(i) == null){
                        System.out.println("One side is larger than the sum of the other two");
                        info.PrintInfo();
                        closedFigures.remove(i);
                        break;
                    }
                    branch(closedFigures, i, info, scanner);
                    ++i;
                    break;
                case "p":
                    info.PrintMessage();
                    closedFigures.add(ClosedFigureFactory.createPolygon());
                    branch(closedFigures, i, info, scanner);
                    ++i;
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
    public static void branch(ArrayList<ClosedFigure> closedFigures, int i, Info info, Scanner scanner){
        int flag = 1;
        System.out.println("closedFigure = " + closedFigures.get(i));
        if(closedFigures.get(i) instanceof CircInsFigure) {
            info.PrintCorrectDetails();
            while (flag == 1) {
                switch (scanner.nextLine()) {
                    case "p":
                        System.out.println(closedFigures.get(i).getPerimeter());
                        info.PrintCorrectDetails();
                        break;
                    case "a":
                        System.out.println(closedFigures.get(i).getArea());
                        info.PrintCorrectDetails();
                        break;
                    case "i":
                        System.out.println(((CircInsFigure) closedFigures.get(i)).getRadiusOfInscribedCircle());
                        info.PrintCorrectDetails();
                        break;
                    case "c":
                        System.out.println(((CircInsFigure) closedFigures.get(i)).getRadiusOfCircumscribedCircle());
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
                    System.out.println(closedFigures.get(i).getPerimeter());
                    info.PrintDetails();
                    break;
                case "a":
                    System.out.println(closedFigures.get(i).getArea());
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
