package org.thecodevillage.intro;

import java.util.Scanner;

/**
 * Created by Stankoech on 10/7/2017.
 */
public class JavaLoopInteger {

    public static void main (String[] args){

        int a;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        a=scanner.nextInt();

        for (int i = 0; i<10; i++) {
            System.out.println(a+"x"+i+"="+ a * i );
        }

//System.out.println(a);
    }
}
