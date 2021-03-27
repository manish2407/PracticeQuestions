package com.practiceQuestion;

public class BoxDemo {
    /*13. Use of static keyword
    static int a=3;
    static int b;
    static void method(int x){
        System.out.println("value of x is :"+x);
        System.out.println("value of a is :"+a);
        System.out.println("value of b is :"+b);
    }
    static{
        System.out.println("Static block execution start");
        b=a*10;
    }*/

    public static void main(String[] args) {
        /* 1.Use of class Concept
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
         */
        /*2. use of method using return type
        Box my = new Box();
        Box my1 = new Box();
        double vol;
        my.l = 10;
        my.b = 10;
        my.h = 10;
        my1.l = 20;
        my1.b = 20;
        my1.h = 20;
        vol = my.volume();
        System.out.println("Volume of my object is"+vol);
        vol = my1.volume();
        System.out.println("Volume of my1 object is"+vol);
         */
        /*3.Use of method with return and parameters
        Box my = new Box();
        Box my1 = new Box();
        double vol;
        double vol1;
        vol = my.volume(5,5,5);
        vol1 = my1.volume(10,10,10);
        System.out.println("Volume of my object is"+vol);
        System.out.println("Volume of my1 object is"+vol1);
         */
        /*4.use of Constructor
        Box my = new Box();
        double vol;
        vol = my.volume();
        System.out.println("volume is :"+vol);
         */
        /*5.Use of parameterised constructor
        Box my = new Box(10,10,10);
        double vol;
        vol = my.volume();
        System.out.println("volume is :"+vol);
         */
        /*6.Instance variable hiding using constructor
        Box my = new Box(10,10,10);
        double vol;
        vol = my.volume();
        System.out.println("volume is :"+vol);
         */
        /*7.Method Overloading
        Box my1 = new Box();
        double vol;
        my1.display();
        my1.display(10);
        my1.display(10,20);
        vol = my1.display(123.3);
        System.out.println("value of vol is "+ vol);
         */
        /*8.Constructor Overloading
        Box my = new Box(10,10,10);
        Box my1 = new Box();
        Box my2 = new Box(10);
        double vol;
        vol = my.volume();
        System.out.println("volume is :"+vol);
        vol = my1.volume();
        System.out.println("volume is :"+vol);
        vol = my2.volume();
        System.out.println("volume is :"+vol);
         */
        /*9.Concept of Call by Value
        Box my1 = new Box();
        int i =10,j=20;
        my1.display(i,j);
        System.out.println("value of i and j is "+i +" "+j);
         */
        /*10 Concept of call by reference
        Box my1 = new Box(10,20);
        System.out.println("ob.a and ob.b before call: "+my1.a + " " + my1.b);
        my1.manish(my1);
        System.out.println("ob.a and ob.b after call: " + my1.a + " " + my1.b);
         */
        /*11. factorial pof number using recursion
        Box my1 = new Box();
        System.out.println(my1.factorial(5));
        System.out.println(my1.factorial(10));*/
        /*12.Use of access Modifier[Public,Private,Protected]
        Box my1 = new Box();
        my1.setC(5);
        System.out.println(my1.a=10);
        System.out.println(my1.b=20);
        System.out.println(my1.getC());
        */
        /*13. Use of Static Keyword
        method(40);
         */




    }
}
