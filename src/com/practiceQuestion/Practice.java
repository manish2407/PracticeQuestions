package com.practiceQuestion;



/**
 this project is to implement basic as well advance questions in java -- Manish Sharma
 */

public class Practice {
public static void  main(String []args){
    /* 1.Basic program
    System.out.println("Hello,welcome to the java world");
     */

    /*2. use of identifiers and literals
    int a=10,b=20;
    int c=a+b;
    System.out.print("value of c:"+c);
    c = c*a;
    System.out.println("Updated value of c:"+c);
     */
    /*3. use of primitive datatypes
    int a = 100;
    long b = 12345678;
    long l = a*b;
    double f = 10.4;
     double pi = 3.1412;
    double area=2*pi*f;
    System.out.println("value of l is :"+l);
    System.out.println("Area is:"+area);
     */
    /* 4.use of escape sequences
    System.out.println("'welcome'");
    System.out.println("\"welcome\"");
    System.out.println("wel\ncome");
    System.out.println("'wel\\come'");
    System.out.println("'wel\rcome'");
    System.out.println("'wel\fcome'");
    System.out.println("'wel\tcome'");
    System.out.println("'wel\bcome'");
     */
    /*5.use of scope of varable
    int a =10;
    if (a==10){
        int y=20;
        System.out.println(a*y);
    }
    //System.out.println(y); this will give error.
    System.out.println(a);
     */
    /* 6.automatic type conversion and type-casting
int a = 257;
double f =  255.123;
byte b;
    System.out.println("conversion of int to byte");
    b = (byte)a;
    System.out.println(b);
    System.out.println("conversion of float to int");
    a = (int)f;
    System.out.println(a);
     */
    /* 7. type conversion to double
    byte b = 50;
    char c = 'a';
    short s = 800;
    int i = 12345;
    long l = 12345678;
    double f = 123.3;
    double d = (b + c + s + i + l + f);
    System.out.println(d);
     */
    /* 8. Array declaration and initialization
    int months[] = new int[12];
    months[0] = 31;
    months[1] =  28;
    months[2] = 31;
    System.out.println("January has "+months[0]+" days");
     */
    /* 9.implementation of 2-D array
    int twoDArray[][] = new int[2][3];
    int i,j;
    for (i=0;i<2;i++){
        for(j=0;j<3;j++){
            twoDArray[i][j]=0;
            System.out.print(twoDArray[i][j]);
        }
        System.out.println();
    }
     */
    /* 10.implementation of arithmatic operator
    int a = 100;
    double b = 1000;
    System.out.println(a+a);
    System.out.println(a-a);
    System.out.println(a*a);
    System.out.println(a/a);
    System.out.println(a%a);
    System.out.println(b+b);
    System.out.println(b-b);
    System.out.println(b*b);
    System.out.println(b/b);
    System.out.println(b%b);
     */
    /* 11.use of bitwise Operators |,&,^
    int a = 10;
    int b = 5;
    System.out.println("a | b is:" + (a | b));
    System.out.println("a & b is:" + (a & b));
    System.out.println("a ^ b is:" + (a ^ b));
    System.out.println("~a is:" + (~a) );
     */
    int val1 = 25;
    int val2;
    val2 = val1 <<2;
    System.out.println("value after left shift is :"+ val2);
    val2 = val1 >> 2;
    System.out.println("value after right shift is :"+ val2);
    val2 = val1 >>> 2;
    System.out.println("value after unsigned right shift is :"+ val2);

}
}
