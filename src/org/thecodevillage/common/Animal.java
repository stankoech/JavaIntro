package org.thecodevillage.common;

/**
 * Created by Stankoech on 10/12/2017.
 */
public class Animal {
    private String name;
    private int age;
    private String kingdom;
    private Boolean canBark;
    private Boolean canMove;
    private Boolean canEat;
    private Boolean isPet;

    public Animal() {
    }

    public Animal(String name, int age, String kingdom, Boolean canBark, Boolean canMove, Boolean canEat, Boolean isPet) {
        this.name = name;
        this.age = age;
        this.kingdom = kingdom;
        this.canBark = canBark;
        this.canMove = canMove;
        this.canEat = canEat;
        this.isPet = isPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public Boolean getCanBark() {
        return canBark;
    }

    public void setCanBark(Boolean canBark) {
        this.canBark = canBark;
    }

    public Boolean getCanMove() {
        return canMove;
    }

    public void setCanMove(Boolean canMove) {
        this.canMove = canMove;
    }

    public Boolean getCanEat() {
        return canEat;
    }

    public void setCanEat(Boolean canEat) {
        this.canEat = canEat;
    }

    public Boolean getPet() {
        return isPet;
    }

    public void setPet(Boolean pet) {
        isPet = pet;
    }
}
