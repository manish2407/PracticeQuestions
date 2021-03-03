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
/*6.Instance variable hiding using constructor
Box(double length,double breadth,double height){
    this.length = length;
    this.breadth = breadth;
    this.height = height;
}
    double volume(){
        return length*breadth*height;
    }
*/
/*7.Method Overloading
void display(){
    System.out.println("hello display 1");
}
    void display(int a){
        System.out.println("hello display value of a is: "+a);
    }
    void display(int a,int b){
        System.out.println("hello display value of a and b is: "+a+" "+b);
    }
    double display(double a){
        System.out.println("value of a*a is");
    return a * a;
    }
 */
Box(double l,double b,double h){
    length = l;
    breadth = b;
    height = h;
}
    Box(){
        length = -1;
        breadth = -1;
        height = -1;
    }
    Box(double l){
        length = l;
        breadth = l;
        height = l;
    }
    double volume(){
        return length*breadth*height;
    }
}
