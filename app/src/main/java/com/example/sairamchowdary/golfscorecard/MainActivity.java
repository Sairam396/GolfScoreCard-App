package com.example.sairamchowdary.golfscorecard;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends ListActivity {

    private Hole[] mHoles = new Hole[18];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int strokes = 0;
        for (int i = 0; i < mHoles.length; i++) {
            mHoles[i] = new Hole("Hole " + (i + 1) + " :", strokes);
        }
    }
}
