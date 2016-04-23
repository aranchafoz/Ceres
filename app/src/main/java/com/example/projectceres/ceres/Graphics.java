package com.example.projectceres.ceres;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by aranchafoz on 23/04/16.
 */
public class Graphics extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphics);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_graphics);
        setSupportActionBar(toolbar);
    }
}
