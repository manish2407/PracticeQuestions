package com.practiceQuestion;


public class Box {
    //double l,b,h;
/*1. use of method without return type
void volume(){
    System.out.println("Volume is ");
    System.out.println(l*b*h);

 */
/*2. use of methods using return type
double volume(){
    return l*b*h;
}
 */
    static int value(int i){
    return i*i*i;
}
    public static void main(String[] args) {
        int x;
        x = value(5);
        System.out.println("value is"+x);
    }
}
