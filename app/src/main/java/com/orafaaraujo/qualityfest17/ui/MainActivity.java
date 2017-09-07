package com.orafaaraujo.qualityfest17.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.orafaaraujo.qualityfest17.R;
import com.orafaaraujo.qualityfest17.model.Person;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);

        Person melisandre = new Person("Melisandre", true, null, null);
        isMelisandre(melisandre);
    }

//    private boolean isMelisandre(Person person) {
//
//        Boolean result = Boolean.TRUE;
//
//        String melisandre = "Melisandre";
//        if (person.getName().equals(melisandre)) {
//            result = false;
//        }
//        return result;
//    }

    private boolean isMelisandre(Person person) {
        Boolean result = Boolean.FALSE;

        String melisandre = "Melisandre";
        if (person.getName().equals(melisandre)) {
            result = true;
        }
        return result;
    }
}
