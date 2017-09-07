package com.orafaaraujo.qualityfest17.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.orafaaraujo.qualityfest17.R;
import com.orafaaraujo.qualityfest17.model.ModelFactory;
import com.orafaaraujo.qualityfest17.model.Person;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ModelFactory modelFactory = new ModelFactory();

        findJonSnow(modelFactory.getPersons());
    }

    private void findJonSnow(List<Person> persons) {
        for (Person person : persons) {
            if (person.getHouse().getName().equals("Stark")
                    && person.isAlive()
                    && person.getName().equals("Jon Snow")) {
                Log.i(TAG, "Jon Snow was founded!");
            }
        }
    }
}
