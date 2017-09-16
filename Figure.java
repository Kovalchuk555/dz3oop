package com.company;


import com.sun.org.apache.xpath.internal.SourceTree;

public class Figure {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    private Point point5;
private String name;
private String type;



    public Figure(Point point, Point point1, Point point2) {
        this.point1 = this.point1;
        this.point2 = this.point2;
        this.point3 = point3;
        type = "Triangle";
        name = this.point1.getName() +
                this.point2.getName() +
                point3.getName();
        System.out.println(name);
        System.out.println(type);
    }
//зачем нужно было создавать 3 конструктора ,как ими воспользоваться в мэйне ?




    public Figure(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        type ="prymoygolnik";
        name =point1.getName()+point2.getName()+point3.getName()+point4.getName();
        System.out.println(name);
        System.out.println(type);
    }



    public Figure(Point point1, Point point2, Point point3, Point point4, Point point5) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        this.point5= point5;
                type="5ygolnik";
                name=point1.getName()+point2.getName()+point3.getName()+point4.getName()+point5.getName();
        System.out.println( name);
        System.out.println(type);


    }
    public Point getPoint5() {
        return point5;
    }

    public void setPoint5(Point point5) {
        this.point5 = point5;
    }

    public Point getPoint4() {

        return point4;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }

    public Point getPoint3() {

        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public   static double  LengthSide(Point A, Point B) {
        double x1;
        double y1;
        double sum;
        x1 = Math.pow(B.getX() - A.getX(), 2);
        y1 = Math.pow(B.getY() - A.getY(), 2);
        sum = Math.sqrt(x1 + y1);
        return sum;
    }

    public  static  double P( Figure figure) {

        double AB = LengthSide(figure.getPoint1(), figure.getPoint2());
        double BC = LengthSide(figure.getPoint2(), figure.getPoint3());
        double CD = LengthSide(figure.getPoint3(), figure.getPoint4());
        double DE =LengthSide(figure.getPoint4(), figure.getPoint5());
                double DA=LengthSide(figure.getPoint5(), figure.getPoint1());
        double p = AB + BC + CD+DE+DA;

        return p;
    }


    }


// Философия
//   Логика
//     Математика
//       Математический анализ
//         Геометрия
