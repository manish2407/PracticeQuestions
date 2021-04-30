package com.practiceQuestion;

import java.util.Scanner;

/**
 this project is to implement basic as well advance questions in java -- Manish Sharma
 */

class Practice {
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
    /* 12. implementation of bitwise left shift, right shift, unsigned right shift operator
    int val1 = 25;
    int val2;
    val2 = val1 <<2;
    System.out.println("value after left shift is :"+ val2);
    val2 = val1 >> 2;
    System.out.println("value after right shift is :"+ val2);
    val2 = val1 >>> 2;
    System.out.println("value after unsigned right shift is :"+ val2);
     */
    //13. You can implement relational, assignment and logical operators from your own end.
    /* 14. implementation of ternary operator in java
    int a = 10,b=10;
    int c = a==b?5:3;
    System.out.println("value of c is : "+c);
     */
    //15. you can implement selection statements like if, if-else-if, nested if by your own
    /* 16. use of switch case selection statements -----
    *****we can use byte ,short,  int , char, string as expression and duplicate value should be in case.*****
    int a = 10;
    switch (a){
        case 5:
            System.out.println("value not matched");
        case 10:
            System.out.println("value matched");
            break;
        default:
            System.out.println("no matching");
    }
     */
    /* 17. while loop
    int a = 10;
    while(a > 0){
        System.out.println("tick tick "+ a);
        a--;
    }
     */
    /* 18.find the midpoint using while loop
    int a = 20, b=30;
    while (++a < --b){
    }
    System.out.println("mid point is "+a);
     */
    /* 19. menu driven program using do while loop
    int choice;
    Scanner sc = new Scanner(System.in);
    do{
        System.out.println("we will help on");
        System.out.println("1. if");
        System.out.println("2. if else");
        System.out.println("3. switch-case");
        System.out.println("4. while");
        System.out.println("5. do-while");
        System.out.println("please choose one from this menu");
        choice = sc.nextInt();
    }
    while(choice < 1 || choice > 6);
    System.out.println("\n");
    switch (choice){
        case 1:
            System.out.println("if(condition){\nstatement;\n}");
            break;
        case 2:
            System.out.println("if(condition){\nstatement;\n}\nelse{statements}");
            break;
        case 3:
            System.out.println("switch(expression){\ncase constant:\nstatement;\nbreak;}");
            break;
        case 4:
            System.out.println(("while(condition){\nstatements;\n}"));
            break;
        case 5:
             System.out.println("do{\nstatements\n}while(conditions)");
             break;
    }*/
    /* 21.Simple for loop
    int a = 5;
    for(int i=0;i<5;i++ ){
        System.out.println("hello "+i);
    }
     */
    /* 22. implementation of for each loop in java
    int a[]={1,2,3,4,5,6,7,8,9,};
    int sum = 0;
    for(int x: a){
        sum +=x;
    }
    System.out.println("sum of array is :" + sum);
     */
    /* 23.implementation of for each loop in 2-D array
    int num[][] = new int[3][3];
    int sum = 0;
    for(int i = 0; i<=2;i++){
        for(int j = 0;j<=2;j++){
            num[i][j]= i+j;
        }
    }
    for (int[] x: num){
        for (int y : x) {
            sum += y;
        }
    }
    System.out.println("total sum is :" + sum);
     */
    /* 24. use of jump statement like break and continue
    int a = 10;
    for (int i = 0;i<10;i++){
        if(i==5){
            continue;
        }
        System.out.println("hello bunny " + i);
        if (i==7){
            break;
        }
    }
     */
    /*25., To check the number is prime or not
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. to check prime or not");
    int n = sc.nextInt();
    int count = 0;
    for (int i = 1; i <=n; i++) {
        if(n%i==0){
            count = count+1;
        }
    }
    if(count==2){
        System.out.println("Number is prime");
    }
    else{
        System.out.println("Number is not prime");
    }*/

}
}
