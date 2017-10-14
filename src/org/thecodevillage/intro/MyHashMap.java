package org.thecodevillage.intro;

import org.thecodevillage.common.Rectangle;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Stankoech on 10/14/2017.
 */
public class MyHashMap {

    public static void main(String[] args){

        Map<Integer, String> kaHashmap=new HashMap<>();
        kaHashmap.put(1,"Koech");
        kaHashmap.put(2,"Koech");
        kaHashmap.put(3,"Daisy");
        kaHashmap.put(4,"Koech");

        Map<Integer, Rectangle> tuHashpam=new HashMap<>();
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(70);

        tuHashpam.put(1,rectangle);

        kaHashmap.get(3);

        tuHashpam.get(1).getLength();

        //using an object

        Rectangle kaRectangle = tuHashpam.get(1);
        kaRectangle.getLength();

    }
}
