package com.example.jerem.test;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class mProgramme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_programme);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // Font path
        String fontPath = "fonts/American-Captain.ttf";

        // text view label
        TextView txtProgramme = (TextView) findViewById(R.id.programme);

        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        // Applying font
        txtProgramme.setTypeface(tf);
            }
        }


