package com.company;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(0, 1 , "A");
        Point point2 = new Point(1, 0 , "B");
        Point point3 = new Point(1, 1 , "C");
        Point point4 = new Point(0, 1 , "D");
        Point point5 = new Point(2, 1 , "C");
        Figure figure=new Figure(point1,point2,point3 );
        Figure figure1=new Figure(point1,point2,point3,point4,point5);
        Figure figure2=new Figure(point1,point2,point3,point4 );
        double side1=Figure.LengthSide(point1,point2);
        double side2=Figure.LengthSide(point2,point3);
        double side3=Figure.LengthSide(point3,point4);
        double side4=Figure.LengthSide(point4,point5);
                double side5=Figure.LengthSide(point5,point1);
 Figure.P(figure);
        System.out.println(figure);
        Figure.P(figure1);
        System.out.println(figure1);
        Figure.P(figure2);
        System.out.println(figure2);




//я не понимаю как вызвать метод р ,как сделать чтоб определяло  тип фигуры


    }
}
