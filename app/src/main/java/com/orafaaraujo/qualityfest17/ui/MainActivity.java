package com.orafaaraujo.qualityfest17.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.orafaaraujo.qualityfest17.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);

//        persons();
    }

//    private void persons() {
//        Person arya = new Person("Arya Stark");
//        Person jaqen = new Person("Jaqen H'ghar");
//
//        whoAreYou(arya);
//        whoAreYou(null);
//    }
//
//    private void whoAreYou(Person person) {
//        Log.d(TAG, "Who are you?" + person.getName());
//    }
//
//    private void isNoOne(Person person) {
//    }
}


