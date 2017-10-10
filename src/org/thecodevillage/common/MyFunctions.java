package org.thecodevillage.common;

/**
 * Created by Stankoech on 10/3/2017.
 */
public class MyFunctions {
    public static int calculateArea(int length, int width){
        return length * width;
    }
    public static int calculatePerimeter(int length, int width){
        return (length + width)*2;
    }

    public static Rectangle calculateArea(Rectangle rectangle){
        int area=0;
        area = rectangle.getLength()*rectangle.getWidth();
        rectangle.setArea(area);
        return rectangle;
    }

    //calculate area of a circle
    //calculate perimiter of circle

    //Mycicle/
    //area
    //perimeter
    //MyCircleMain
    public static double calcArea(double pi, double radius){
        return (pi*radius*radius);
    }
    public static double calcPerim(double pi, double radius){
        return (2*pi*(radius*2));
    }

    //function to calculate area expecting object as a parameter

    public static MyCircle calcArea(MyCircle mycircle){
        double area;
        area=mycircle.getRadius()*mycircle.getRadius()*mycircle.getPi();
        mycircle.setArea(area);
        return mycircle;
    }

    public static MyCircle calcperim(MyCircle mycircle) {
        double perimeter;
        perimeter = (mycircle.getRadius()*2) * mycircle.getPi()*2;
        mycircle.setPerimeter(perimeter);
        return mycircle;
    }
}
