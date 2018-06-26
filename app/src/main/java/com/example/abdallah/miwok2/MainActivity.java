package com.example.abdallah.miwok2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbersTextView = findViewById(R.id.numbers);
        TextView familyTextView = findViewById(R.id.family);
        TextView colorsTextView = findViewById(R.id.colors);
        TextView phrasesTextView = findViewById(R.id.phrases);
        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numbers = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbers);
            }
        });

        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent family = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(family);
            }
        });

        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colors = new Intent(MainActivity.this , ColorsActivity.class);
                startActivity(colors);
            }
        });

        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrases = new Intent(MainActivity.this , PhrasesActivity.class);
                startActivity(phrases);
            }
        });
    }
}
