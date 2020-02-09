package com.company.lesson2;

import java.util.*;

public class ClosedFigureFactory {
    private static Scanner scanner = new Scanner(System.in);

    public static Circle createCircle(){
        int radius = scanner.nextInt();
        Circle circle = new Circle();
        circle.setRadius(radius);

        return circle;
    }

    public static Rectangle createRectangle(){
        int width = scanner.nextInt();
        int length = scanner.nextInt();

        if(width == length)
            return new Square(length);

        return new Rectangle(width, length);
    }

    public static Triangle createTriangle(){
        List<Double> side = new ArrayList<>();
        scanner.useLocale(Locale.US);
        side.add(scanner.nextDouble());
        side.add(scanner.nextDouble());
        side.add(scanner.nextDouble());
        Collections.sort(side);
        Collections.reverse(side);

        /*double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();*/

        if(side.get(0) >= side.get(1) + side.get(2))
            return null;

        if(side.get(0) == Math.sqrt(Math.pow(side.get(1), 2) + Math.pow(side.get(2), 2)))
            return new RightTriangle(side.get(0), side.get(1), side.get(2));

        //return new Triangle(a, b, c);
        return new Triangle(side.get(0), side.get(1), side.get(2));
    }

    public static Polygon createPolygon(){
        int numberOfSides = scanner.nextInt();
        int length = scanner.nextInt();

        return new Polygon(numberOfSides, length);
    }

    public static void test(int i){

    }

    public static void test(String s){

    }


}