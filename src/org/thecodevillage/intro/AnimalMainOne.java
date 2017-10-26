package org.thecodevillage.intro;

import org.thecodevillage.common.Animal;
import org.thecodevillage.common.AnimalFunction;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

/**
 * Created by Stankoech on 10/12/2017.
 */
public class AnimalMainOne {

    public static void main(String[] args){

       // System.out.println("myString is: " + myString);
       // System.out.println("myInt is: " + myInt);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter no of animals");
        int n =scanner.nextInt();

        String [] name = new String[n];
        int [] age = new int[n];
        String [] Kingdom = new String[n];
        Boolean canBark;
        Boolean canMove;
        Boolean isPet;
        List<Animal> animalList = new ArrayList<>();

        for (int i = 0; i< n; i++){
            Animal animal=new Animal();
            System.out.println("Enter the name of animal " + (i+1));
            animal.setName(scanner.next());
            System.out.println("Enter the age of animal " + (i+1));
            animal.setAge(scanner.nextInt());
            System.out.println("Enter the Kingdom of animals " + (i+1));
            animal.setKingdom(scanner.next());
            System.out.println("Can Animal Bark? " + (i+1));
            animal.setCanBark(scanner.nextBoolean());
            System.out.println("Can Animal MOVE? " + (i+1));
            animal.setCanMove(scanner.nextBoolean());
            System.out.println("Is animal a pet? " + (i+1));
            animal.setPet(scanner.nextBoolean());

            animalList.add(animal);
        }

        AnimalFunction.outputlist(animalList);
        // System.out.println("Name: " + animals);

    }
}
