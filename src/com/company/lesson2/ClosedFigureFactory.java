package com.company.lesson2;

import java.util.*;

public class ClosedFigureFactory {
    private static Scanner scanner = new Scanner(System.in);

    public static Circle createCircle() throws FiguresException {
        int radius = (int) setLength();

        Circle circle = new Circle();
        circle.setRadius(radius);

        return circle;
    }

    public static Rectangle createRectangle() throws FiguresException {
        int width = (int) setLength();
        int length = (int) setLength();


        if(width == length)
            return new Square(length);

        return new Rectangle(width, length);
    }

    public static Triangle createTriangle() throws FiguresException {
        List<Double> side = setSides();

        if(side.get(0) == Math.sqrt(Math.pow(side.get(1), 2) + Math.pow(side.get(2), 2)))
            return new RightTriangle(side.get(0), side.get(1), side.get(2));

        return new Triangle(side.get(0), side.get(1), side.get(2));
    }

    public static Polygon createPolygon() throws FiguresException {
        int numberOfSides = setNumberOfSides();
        int length = (int) setLength();

        return new Polygon(numberOfSides, length);
    }

    public static double getLength() throws FiguresException {
        double length = scanner.nextDouble();
        if(length > 0){
            return length;
        }else{
            throw new FiguresException("Length must be positive.");
        }
    }

    public static double setLength() {
        double length = 0;
        while(length == 0){
            try {
                length = getLength();
            }catch (FiguresException e){
                e.printStackTrace();
                e.getMessage();
                System.out.println("Try again.");
            }
        }
        return length;
    }

    public static int getNumberOfSides() throws FiguresException {
        int numberOfSides = scanner.nextInt();
        if(numberOfSides > 2){
            return numberOfSides;
        }else{
            throw new FiguresException("Number of sides must be more than 2.");
        }
    }

    public static int setNumberOfSides(){
        int numberOfSides = 0;
        while(numberOfSides == 0){
            try{
                numberOfSides = getNumberOfSides();
            }catch (FiguresException e){
                e.printStackTrace();
                e.getMessage();
                System.out.println("Try again.");
            }
        }
        return numberOfSides;
    }

    public static void sideControl(List<Double> side) throws FiguresException {
        scanner.useLocale(Locale.US);
        side.add(setLength());
        side.add(setLength());
        side.add(setLength());
        Collections.sort(side, Collections.reverseOrder());

        if(side.get(0) >= side.get(1) + side.get(2)) {
            side.clear();
            throw new FiguresException("One side is larger than the sum of the other two.");
        }
    }

    public static List<Double> setSides(){
        List<Double> side = new ArrayList<>();

        while(side.isEmpty()){
            try {
                sideControl(side);
            }catch (FiguresException e){
                e.printStackTrace();
                e.getMessage();
                System.out.println("Try again.");
            }
        }
        return  side;
    }
}