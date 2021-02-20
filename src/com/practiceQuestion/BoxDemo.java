package com.practiceQuestion;

public class BoxDemo {
    public static void main(String[] args) {
        Box my = new Box();
        double volume;
        my.l = 10;
        my.b = 10;
        my.h = 10;
        volume = my.l*my.b*my.h;
        System.out.println("volume is :" + volume);
    }
}
