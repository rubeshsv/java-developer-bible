package com.rubeshsv.bible.month1.week2.day4;

/* Interview relevance: "model a shape, compute its area" — a classic that pairs OOP with return values.
Setup: class Rectangle (same package/day).
Build:
    1. Two fields: double width; and double height;
    2. Two methods that return (not void):
         i. double area() → returns width * height
         ii. double perimeter() → returns 2 * (width + height)
    3. In main:
        i. create a Rectangle with new, set width = 5, height = 3,
        ii. print its area and perimeter (capture or print the returned values),
        iii. create a second rectangle (width = 10, height = 2) and print its area.
*/
public class Rectangle {
    double width;
    double height;

    double area(){
        return width*height;
    }
    double perimeter(){
        return 2*(width+height);
    }
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle();
        rectangle1.width=5.0;
        rectangle1.height=3.0;
        double a = rectangle1.area();
        double b = rectangle1.perimeter();
        System.out.println("Rectangle 1 width = "+rectangle1.width+" and height = "+rectangle1.height);
        System.out.println("Area of Rectangle 1 = "+a);
        System.out.println("Perimeter of Rectangle 1 = "+b);
        Rectangle rectangle2 = new Rectangle();
        rectangle2.width=10.0;
        rectangle2.height=2.0;
        double c = rectangle2.area();
        System.out.println("Rectangle 2 width = "+rectangle2.width+" and height = "+rectangle2.height);
        System.out.println("Area of Rectangle 2 = "+c);
    }
}
