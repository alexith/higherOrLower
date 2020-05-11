package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static java.lang.Math.random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void guessInProgress(View view){

    EditText guessedNumber = findViewById(R.id.guessedNumber);

    Double finalGuessedNumber = Double.parseDouble(guessedNumber.getText().toString());


        if (finalGuessedNumber > randomNumber){
            Toast.makeText(MainActivity.this, "Greater", Toast.LENGTH_SHORT).show();
        } else if (finalGuessedNumber < randomNumber){
            Toast.makeText(MainActivity.this, "Lesser", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "You'r right! :), continue?", Toast.LENGTH_SHORT).show();

            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;
    }
}
