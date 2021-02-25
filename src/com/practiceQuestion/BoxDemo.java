package com.practiceQuestion;

public class BoxDemo {
    int length;
    int breadth;
    int height;

    public static void main(String[] args) {
        Box my = new Box();
        BoxDemo my1 = new BoxDemo();
        double volume1;
        double volume2;
        my.l = 10;
        my.b = 10;
        my.h = 10;
        my1.length = 20;
        my1.breadth = 20;
        my1.height = 20;
        volume1 = my.l*my.b*my.h;
        volume2 = my1.length*my1.breadth*my1.height;
        System.out.println("volume of Box class is :" + volume1);
        System.out.println("volume of BoxDemo class is :" + volume2);
    }
}
