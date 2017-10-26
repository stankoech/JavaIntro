package org.thecodevillage.intro;

public class Example {

public static void main(String[] args){
    System.out.println("Hello World!");
    System.out.println("Hello World!");

    loopMe();

    char a = 'a';

    System.out.print(Character.toUpperCase(a));
     }

    private static void loopMe() {
        int top =10;
        for (int i = 0; i < top; i++) {
            System.out.println("The value is " +i);

        }
    }
}