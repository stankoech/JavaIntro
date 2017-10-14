package org.thecodevillage.intro;

import org.thecodevillage.common.MyFunctions;
import org.thecodevillage.common.Rectangle;

/**
 * Created by Stankoech on 10/3/2017.
 */
public class RectangleMain {

    public static void main (String[] args){
        int length = 0;
        int width =0;
        int area = 0;
        int perimeter=0;

        length = 20;
        width =50;

        //area = length*width;
        //perimeter = (length+width)*2;

        System.out.println("Area is: "+area);
        System.out.println("Perimeter is: "+perimeter);

        area=MyFunctions.calculateArea(length,width);
        perimeter=MyFunctions.calculatePerimeter(length,width);

        System.out.println("Area is "+area);
        System.out.println("Perimeter is "+perimeter);

        /**
         * Playing with rectangle image
         * We have created getters and setters and created 2 constructors
         * Rectangle is a datatype * someObject is an object
         * Rectangle() is the default constructor.
         */

        Rectangle someObject=new Rectangle();

        someObject.setLength(50);
        someObject.setWidth(40);

        area = MyFunctions.calculateArea(someObject.getLength(),someObject.getWidth());

        System.out.println("Area of someObject is:"+area);

    }

}
