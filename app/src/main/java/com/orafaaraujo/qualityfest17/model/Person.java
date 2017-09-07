package com.orafaaraujo.qualityfest17.model;

/**
 * Created by rafael on 9/6/17.
 */

public class Person {

    private final String mName;
    private final boolean mAlive;
    private final House mHouse;
    private final Animal mAnimal;

    Person(String name, boolean alive, House house, Animal animal) {
        mName = name;
        mAlive = alive;
        mHouse = house;
        mAnimal = animal;
    }

    public String getName() {
        return mName;
    }

    public boolean isAlive() {
        return mAlive;
    }

    public House getHouse() {
        return mHouse;
    }

    public Animal getAnimal() {
        return mAnimal;
    }
}
