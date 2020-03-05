package com.company.lesson2;

public enum Priority {
    CIRCLE("Circle") {
        public int getPriority() {
            return 1;
        }
    },
    TRIANGLE("Triangle") {
        public int getPriority() {
            return 2;
        }
    },
    RIGHT_TRIANGLE("RightTriangle") {
        public int getPriority() {
            return 3;
        }
    },
    RECTANGLE("Rectangle") {
        public int getPriority() {
            return 4;
        }
    },
    SQUARE("Square") {
        public int getPriority() {
            return 5;
        }
    },
    POLYGON("Polygon") {
        public int getPriority() {
            return 6;
        }
    };

    String name;

    Priority(String name){
        this.name = name;
    }

    public static Priority valueFromString(String name){
        for(Priority priority : Priority.values()){
            if(priority.name.equals(name)){
                return priority;
            }
        }
        return null;
    }

    public abstract int getPriority();
}