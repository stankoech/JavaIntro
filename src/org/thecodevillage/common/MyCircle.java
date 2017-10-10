package org.thecodevillage.common;

/**
 * Created by Stankoech on 10/7/2017.
 */
public class MyCircle {
    private double radius;
    private double pi;
    private double area;
    private double perimeter;

    public MyCircle() {
    }

    public MyCircle(double radius, double pi) {
        this.radius = radius;
        this.pi = pi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
