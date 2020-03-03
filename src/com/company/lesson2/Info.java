package com.company.lesson2;

public class Info {

    public static void PrintInfo(){
        System.out.println("Press r for rectangle\n" +
                           "Press c for circle\n" +
                           "Press t for triangle\n" +
                           "Press p for polygon\n" +
                           "Press pr to print\n" +
                           "Press q for exit\n");
    }

    public static void PrintMessage(){
        System.out.println("Enter value");
    }

    public static void PrintDetails(){
        System.out.println("Press p for perimeter\n" +
                           "Press a for the area\n" +
                           "Press q to return\n");
    }
    public static void PrintCorrectDetails(){
        System.out.println("Press p for perimeter\n" +
                           "Press a for the area\n" +
                           "Press i for Radius Of Inscribed Circle\n" +
                           "Press c for Radius Of Circumscribed Circle\n" +
                           "Press q to return\n");
    }
    public static void PrintBye(){
        System.out.println("Have a nice day!");
    }
}