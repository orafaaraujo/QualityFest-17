package com.orafaaraujo.qualityfest17.model;

/**
 * Created by rafael on 9/6/17.
 */

class Animal {

    private final String mName;

    private final AnimalType mAnimalType;

    /**
     * Constructor.
     *
     * @param name
     * @param animalType
     */
    Animal(String name, AnimalType animalType) {
        mName = name;
        mAnimalType = animalType;
    }

    public String getName() {
        return mName;
    }

    public AnimalType getAnimalType() {
        return mAnimalType;
    }
}
