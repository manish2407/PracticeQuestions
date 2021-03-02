package com.practiceQuestion;


public class Box {
    double length,breadth,height;
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
    /*3. use of method using return type and parameter
    static int value(int i){
    return i*i*i;
}
    public static void main(String[] args) {
        int x;
        x = value(5);
        System.out.println("value is"+x);
    }
     */
    /*Use of method with return and parameters
    double volume(double l,double b,double h){
        length = l;
        breadth = b;
        height = h;
        return length*breadth*height;
    }
     */
    /*4. use of constructor
    Box(){
        length = 10;
        breadth = 10;
        height = 10;
    }
    double volume(){
        return length*breadth*height;
    }
     */
    /*5.Use of parameterised constructor
    Box(double l,double b,double h){
        length = l;
        breadth = b;
        height = h;
    }
    double volume(){
        return length*breadth*height;
    }
     */
Box(double length,double breadth,double height){
    this.length = length;
    this.breadth = breadth;
    this.height = height;
}
    double volume(){
        return length*breadth*height;
    }
}
