package org.thecodevillage.common;

import java.util.List;

/**
 * Created by Stankoech on 10/12/2017.
 */
public class AnimalFunction {

    public static void pet(Animal myanimal){
        if (myanimal.getPet()==Boolean.TRUE){
            System.out.println(myanimal.getName()+" "+" is a pet");
        }
        else {
            System.out.println(myanimal.getName()+" "+" is not a pet");
        }
    }
    public static void bark(Animal myanimal){
        if (myanimal.getCanBark()==Boolean.TRUE){
            System.out.println(myanimal.getName()+" "+" is barking");
        }
        else {
            System.out.println(myanimal.getName()+" "+" is not barking");
        }
    }
    public static void move(Animal myanimal){
        if (myanimal.getCanMove()==Boolean.TRUE){
            System.out.println(myanimal.getName()+" "+" can move");
        }
        else {
            System.out.println(myanimal.getName()+" "+" cannot move");
        }
    }
     public static void outputlist(List<Animal> animalList){
         for (int y=0; y < animalList.size(); y++){
             Animal myanimal=animalList.get(y);
             System.out.println("Name:" +myanimal.getName()+" Age: "+myanimal.getAge()+" Kingdom: " +myanimal.getKingdom()+
                     " canBark: "+myanimal.getCanBark()+" canMove: "+myanimal.getCanMove()+" isPet: "+myanimal.getPet());
             AnimalFunction.bark(myanimal);
             AnimalFunction.move(myanimal);
             AnimalFunction.pet(myanimal);
         }
    }
}
