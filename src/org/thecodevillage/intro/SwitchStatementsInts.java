package org.thecodevillage.intro;

import java.util.Scanner;
/**
 * Created by Stankoech on 10/18/2017.
 */
public class SwitchStatementsInts {

    MyEnum month =MyEnum.FEBRUARY;

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please a number bethween 1 and 12");
        int month = scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("The Month is January");
                break;
            case 2:
                System.out.println("The Month is February");
                break;
            case 3:
                System.out.println("The Month is March");
                break;
            default:
                System.out.println("Month is out of case");
                break;
        }
    }
}
