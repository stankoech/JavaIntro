package org.thecodevillage.intro;

import java.util.Scanner;

/**
 * Created by Stankoech on 10/7/2017.
 */
public class MyStudentsArray {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter no of students");
        int n=scanner.nextInt();


        String [] names = new String[n];
        //store the names in array

       for (int i = 0; i< names.length; i++){
            System.out.println("Enter the name of student " + (i+1));
            names[i] = scanner.next();
        }

//        for (int i = 0; i< names.length; i++){
//            System.out.println("" +
//                    "Name: " + names[i]);
//
//        }

       // for (int i = 0; i< names.length; i++) {
            System.out.println("Name: " + names[0]);
       // }


    }
}
