package org.thecodevillage.intro;

import org.thecodevillage.common.MyFunctions;
import org.thecodevillage.common.Rectangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stankoech on 10/10/2017.
 */
public class MyArrayList {
    static int[] myData=new int[10];

    static int area1 =0;
    static int area2 =0;
    static int area3 =0;
    static int length=0;
    static int width=0;

    public static void main(String[] args){

        //List//Array List

        List<String> kaList=new ArrayList<>();
        kaList.add("Stanley");
        kaList.add("Elkannah");
        kaList.add("Hilda");
        kaList.add("Nicholas");
        kaList.add("Daisy");

        List<Integer> tuList=new ArrayList<>();
        tuList.add(100);
        tuList.add(200);
        tuList.add(300);
        tuList.add(400);
        tuList.add(500);

        Rectangle object1 = new Rectangle();
        object1.setLength(40);
        object1.setWidth(20);
        area1=MyFunctions.calculateArea(object1.getLength(), object1.getWidth());
        object1.setArea(area1);

        Rectangle object2 = new Rectangle();
        object2.setLength(50);
        object2.setWidth(100);
        area2=MyFunctions.calculateArea(object2.getLength(), object2.getWidth());
        object2.setArea(area2);

        Rectangle object3 = new Rectangle();
        object3.setLength(60);
        object3.setWidth(40);
        area3=MyFunctions.calculateArea(object3.getLength(), object3.getWidth());
        object3.setArea(area3);

//        System.out.println("Area 1 is:"+area1);
//        System.out.println("Area 2 is:"+area2);
//        System.out.println("Area 3 is:"+area3);

        List<Rectangle> reList=new ArrayList<>();
        reList.add(object1);
        reList.add(object2);
        reList.add(object3);

        //System.out.println(kaList);

        reList.get(0);

        //System.out.println(kaList.get(0));


        for (int x=0; x < kaList.size(); x++)
            System.out.println(kaList.get(x));


        for (int y=0; y < reList.size(); y++)
            System.out.println(reList.get(y).getArea());

//        for (int y=0; y < reList.size(); y++) {
//            Rectangle myValue = reList.get(y);
//            System.out.println(myValue.getArea();
//        }

        reList.remove(0);
}
}
