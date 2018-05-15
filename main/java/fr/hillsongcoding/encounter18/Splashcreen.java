package fr.hillsongcoding.encounter18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashcreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(Splashcreen.this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}
