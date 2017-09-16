package com.company;

public class Main {

    public static void main(String[] args) {
        Point point1 = new Point(0, 1 , "A");
        Point point2 = new Point(1, 0 , "B");
        Point point3 = new Point(1, 1 , "C");
        Point point4 = new Point(0, 1 , "D");
        Point point5 = new Point(2, 1 , "C");
        double side1=Figure.LengthSide(point1,point2);
        double side2=Figure.LengthSide(point2,point3);
        double side3=Figure.LengthSide(point3,point1);
        System.out.println(side1+"   "+side2+"   ");
 double  p=side1+side2+side3;

//я не понимаю как вызвать метод р ,как сделать чтоб определяло  тип фигуры


    }
}
