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

    public static double setLength() throws FiguresException {
        double length = scanner.nextDouble();
        if(length > 0){
            return length;
        }else{
            throw new FiguresException("Length must be positive.");
        }
    }

    public static int setNumberOfSides() throws FiguresException {
        int numberOfSides = scanner.nextInt();
        if(numberOfSides > 2){
            return numberOfSides;
        }else{
            throw new FiguresException("Number of sides must be more than 2.");
        }
    }

    public static List<Double> setSides() throws FiguresException {
        List<Double> side = new ArrayList<>();
        scanner.useLocale(Locale.US);
        side.add(setLength());
        side.add(setLength());
        side.add(setLength());
        Collections.sort(side, Collections.reverseOrder());

        if(side.get(0) >= side.get(1) + side.get(2)) {
            side.clear();
            throw new FiguresException("One side is larger than the sum of the other two.");
        }
        return side;
    }
}