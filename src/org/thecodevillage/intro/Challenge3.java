package org.thecodevillage.intro;

import java.util.Scanner;

/**
 * Created by Stankoech on 10/8/2017.
 */
public class Challenge3 {

    public static void main (String[] args){

        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();
        double d =scanner.nextDouble();
        String answer="";
        if (n%2==1){
            System.out.println("Weird");
        }
        else{
            answer = "Not Weird";
        }
    }
}
