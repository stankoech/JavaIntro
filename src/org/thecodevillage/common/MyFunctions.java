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
}
