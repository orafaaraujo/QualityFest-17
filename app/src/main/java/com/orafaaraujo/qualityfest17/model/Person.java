package com.orafaaraujo.qualityfest17.model;

/**
 * Created by rafael on 9/6/17.
 */

public class Person {

    private final String mName;
    private boolean mAlive;
    private House mHouse;
    private Animal mAnimal;

    /**
     * Constructor.
     *
     * @param name
     * @param alive
     * @param house
     * @param animal
     */
    public Person(String name, boolean alive, House house, Animal animal) {
        mName = name;
        mAlive = alive;
        mHouse = house;
        mAnimal = animal;
    }

    /**
     * Constructor
     *
     * @param name
     */
    public Person(String name) {
        mName = name;
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
