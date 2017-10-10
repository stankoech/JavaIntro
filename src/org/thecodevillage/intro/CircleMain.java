package org.thecodevillage.intro;

import org.thecodevillage.common.MyFunctions;
import org.thecodevillage.common.MyCircle;

import java.util.Scanner;

/**
 * Created by Stankoech on 10/7/2017.
 */
public class CircleMain {
    public static void main (String[] args){
        double radius =0;
        double pi=3.142;

        double area=0;
        double perimeter=0;

        Scanner scanner =new Scanner(System.in);
       System.out.println("Please enter the radius");
       radius=scanner.nextDouble();

       //System.out.println("Please enter the pi");
       //pi=scanner.nextInt();

     //  System.out.println("Area is :"+area);
        // System.out.println("Parameter is :"+perimeter);

        area=MyFunctions.calcArea(pi,radius);
        perimeter=MyFunctions.calcPerim(pi,radius);

       // System.out.println("Area is :"+area);
       // System.out.println("Parameter is :"+perimeter);

        MyCircle objMyobject = new MyCircle();

        objMyobject.setRadius(radius);
        objMyobject.setPi(pi);

       area =MyFunctions.calcArea(objMyobject.getRadius(),pi);

// sta/per is an object variable used to store the value returned in MyFunctions.calcArea

       MyCircle sta =MyFunctions.calcArea(objMyobject);

        MyCircle per =MyFunctions.calcperim(objMyobject);

       System.out.println("Area of the circle is:"+area);

       System.out.println("Area of the new circle is:"+sta.getArea());

        System.out.println("Perimeter of the new circle is:"+per.getPerimeter());
        //Math.pow(5,5);



    }


}
