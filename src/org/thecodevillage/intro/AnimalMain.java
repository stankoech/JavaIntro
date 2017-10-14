package org.thecodevillage.intro;

import org.thecodevillage.common.AnimalFunctions;
import org.thecodevillage.common.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Stankoech on 10/12/2017.
 */
public class AnimalMain {

    public static void main(String[] args){

       //Animal animal = new Animal();
//       AnimalFunctions.pet();
//       AnimalFunctions.bark();
//       AnimalFunctions.move();

        Animal animal1 = new Animal();
        animal1.setName("Hyena");
        animal1.setAge(2);
        animal1.setKingdom("Medium");
        animal1.setCanBark(Boolean.TRUE);
        animal1.setCanMove(Boolean.TRUE);
        animal1.setPet(Boolean.FALSE);
       // animal1.getAge(),animal1.getName()

        Animal animal2 = new Animal();
        animal2.setName("Dog");
        animal2.setAge(4);
        animal2.setKingdom("Small");
        animal2.setCanBark(Boolean.TRUE);
        animal2.setCanMove(Boolean.TRUE);
        animal2.setPet(Boolean.TRUE);

        Animal animal3 = new Animal();
        animal3.setName("Giraffe");
        animal3.setAge(6);
        animal3.setKingdom("Big");
        animal3.setCanBark(Boolean.FALSE);
        animal3.setCanMove(Boolean.TRUE);
        animal3.setPet(Boolean.FALSE);

        Animal animal4 = new Animal();
        animal4.setName("Elephant");
        animal4.setAge(8);
        animal4.setKingdom("Big");
        animal4.setCanBark(false);
        animal4.setCanMove(true);
        animal4.setPet(Boolean.FALSE);


        Animal animal5 = new Animal();
        animal5.setName("Cow");
        animal5.setAge(10);
        animal5.setKingdom("Medium");
        animal5.setCanBark(Boolean.FALSE);
        animal5.setCanMove(Boolean.TRUE);
        animal5.setPet(Boolean.FALSE);

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter no of animals");
        int n=scanner.nextInt();
        String [] animals = new String[n];
        //store the names in array
        for (int i = 0; i< n; i++){
            System.out.println("Enter the name of the animal " + (i+1));
            animals[i] = scanner.next();
        }*/

        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);
        animalList.add(animal5);

        animalList.get(0);

//        for (int y=0; y < animalList.size(); y++){
//            Animal myanimal=animalList.get(y);
//            System.out.println("Name:" +myanimal.getName()+" Age: "+myanimal.getAge()+" Kingdom: " +myanimal.getKingdom()+
//                    " canBark: "+myanimal.getCanBark()+" canMove: "+myanimal.getCanMove()+" isPet: "+myanimal.getPet());
//            AnimalFunctions.bark(myanimal);
//            AnimalFunctions.move(myanimal);
//            AnimalFunctions.pet(myanimal);
//        }

        AnimalFunctions.outputlist(animalList);

       // System.out.println("Name: " + animals);

    }
}
