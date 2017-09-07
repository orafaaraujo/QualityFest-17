package com.orafaaraujo.qualityfest17.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafael on 9/6/17.
 */

public class ModelFactory {

    private final List<Person> mPersons;

    /**
     * Constructor.
     */
    public ModelFactory() {
        mPersons = new ArrayList<>();

        final House stark = new House("Stark");
        final House targaryen = new House("Targaryen");

        final AnimalType mWolf = new AnimalType("Wolf");
        final AnimalType mDragon = new AnimalType("Dragon");

        final Animal ghost = new Animal("Ghost", mWolf);
        final Person jon = new Person("Jon Snow", true, stark, ghost);
        mPersons.add(jon);

        final Animal nymeria = new Animal("Nymeria", mWolf);
        final Person arya = new Person("Arya Stark", true, stark, nymeria);
        mPersons.add(arya);

        final Animal summer = new Animal("Summer", mWolf);
        final Person bran = new Person("Brandon Stark", true, stark, summer);
        mPersons.add(bran);

        final Person ned = new Person("Ned Stark", true, stark, null);
        mPersons.add(ned);

        final Animal drogon = new Animal("Drogon", mDragon);
        final Person daenerys = new Person("Daenerys Targaryen", true, targaryen, drogon);
        mPersons.add(daenerys);

        final Person rhaegar = new Person("Rhaegar Targaryen", false, targaryen, null);
        mPersons.add(rhaegar);
    }

    public List<Person> getPersons() {
        return mPersons;
    }
}
